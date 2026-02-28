package com.example.aws_deploy_cse;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CseController {

    @GetMapping("/cseadd")
    public String addCSE(@RequestParam int a,@RequestParam int b) {
        int c=a+b;
        return "Hello Aditya University. This is done by 23MH1A05O1. a+b= "+c;
    }
    
}
