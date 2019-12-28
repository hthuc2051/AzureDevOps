package com.thucnh.azuredevops;

import com.thucnh.azuredevops.controllers.TodoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @Test
    public void setUp(){
//        Mockito.when(todoService.compute(1,2));
        assertEquals("5",todoService.compute(3,2));
    }

//    @Test
//    public void whenWithAnnotationProvidedParams_thenSafeAdd(
//            int a, int b, int expectedValue) {
//
//        assertEquals(expectedValue, todoService.compute(a, b));
//    }
}
