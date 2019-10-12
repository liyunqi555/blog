package com.lyq.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OpsController {

    @RequestMapping
    public String iLoveCxj() {
        return "我爱陈雪姣";
    }



}