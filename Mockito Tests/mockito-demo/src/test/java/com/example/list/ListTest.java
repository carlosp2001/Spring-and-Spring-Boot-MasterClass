package com.example.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

    @Test
    void test() {
        // En el
        List listMock = mock(List.class);
//        listMock.size() => 3
        when(listMock.size()).thenReturn(3);

    }

}
