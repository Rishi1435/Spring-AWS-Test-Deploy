package com.example.aws_deploy_cse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CseControllerTest {

    @Autowired
    CseController c;
    @Test
    void test(){
        String result=c.addCSE(2,3);
        assertEquals("Hello Aditya University. This is done by 23MH1A05O1. a+b= 5", result);
    }

}
