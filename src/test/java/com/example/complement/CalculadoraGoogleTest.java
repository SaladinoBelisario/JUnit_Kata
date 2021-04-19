package com.example.complement;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalculadoraGoogleTest {

    @Mock
    CalculadoraGoogle calculadoraGoogle;

    @InjectMocks
    Calculadora calculadora;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        //Mock of the method from the Google API
        when(calculadoraGoogle.sumar(5, 5)).thenReturn(10);
    }

    @Test
    public void sumaGoogleTest(){
        assertEquals(10, calculadora.sumaGoogle(5, 5));
    }
}
