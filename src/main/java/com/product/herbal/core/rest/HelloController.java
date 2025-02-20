package com.product.herbal.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping()
public class HelloController {

    @GetMapping("/hello")
    public String  Hello()
    {
        return "Hello";
    }
}
