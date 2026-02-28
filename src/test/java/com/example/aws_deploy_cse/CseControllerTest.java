package com.example.aws_deploy_cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CseControllerTest {

    @Autowired
    CseController c;
    @Test
    void test(){
        int result=c.addCSE(2,3);
        assertEquals(5, result);
    }

}
