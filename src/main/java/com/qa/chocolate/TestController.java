package com.qa.chocolate;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {

    public String hello() {
        return "Hello World";
    }
}
