package com.example.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBusinessImplTest {
    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataService = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataService);

        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataService = new DataServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataService);

        assertEquals(35, businessImpl.findTheGreatestFromAllData());
    }

}
// El problema de utilizar estos stubs es el dificil mantenimiento, ya que por cada
// caso diferente de prueba debemos crear una nueva clase que haga referencia a nuevos
// valores

class DataServiceStub1 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }


}

class DataServiceStub2 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }


}