package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // Especificamos el alcance prototipo, esto nos permite poder crear diferentes instacias del bean,
// cada vez que requerimos una instancia
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Forma correcta de especificar el alcance
public class BinarySearchImpl {

    // 1- Forma haciendo uso de búsqueda por nombre

    // Al no haber especificado ningún bean con @Primary podemos realizar la inyección
    // de la dependencia por medio de búsqueda por nombre
//    @Autowired
//    private SortAlgorithm bubbleSortAlgorithm;

    // 2 - Forma haciendo uso de @qualifier, @qualifier busca en las clases por un bean que contenga
    // esta etiqueta
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

    // Implementando setter injection
    // Si es una dependencia opcional es preferible utilizar setter injection, si es una
    // dependencia obligatoria es mucho mejor utilizar el constructor

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // Bubble Sort algorithm
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        bubbleSortAlgorithm.sort(numbers);

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Search the array

        // Return the result
        return 3;
    }
}
