package com.thucnh.azuredevops;

import com.thucnh.azuredevops.controllers.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class AzuredevopsApplicationTests {
    @Autowired
    private TodoService todoService;

    @Test
    void contextLoads() {
        System.out.println('a');
    }

    @Test
    public void setUp() {
        assertEquals(Integer.valueOf(5), todoService.compute(3, 2));
    }

}
