package com.xztx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author xztx
 * @Date 2020/9/2 16:37
 **/
@RestController
@RequestMapping("/xztx")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello xztx";
    }

}
