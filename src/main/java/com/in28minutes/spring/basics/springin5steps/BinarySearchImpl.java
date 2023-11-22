package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    // Al no haber especificado ningún bean con @Primary podemos realizar la inyección
    // de la dependencia por medio de búsqueda por nombre
    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

    // Implementando setter injection
    // Si es una dependencia opcional es preferible utilizar setter injection, si es una
    // dependencia obligatoria es mucho mejor utilizar el constructor

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.bubbleSortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor)  {
        // Bubble Sort algorithm
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        bubbleSortAlgorithm.sort(numbers);

        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);

        // Search the array

        // Return the result
        return 3;
    }
}
