package com.example.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class IndexControllerTest {

    @Test
    public void IndexControllerTestNull(){
        IndexController controller = new IndexController();
        assertEquals("Array Vacío", controller.welcome(null));
    }

    @Test
    public void IndexControllerTestParams(){
        IndexController controller = new IndexController();
        String[] params = {"a", "b", "c"};
        assertEquals("abc", controller.welcome(params));
    }

}
