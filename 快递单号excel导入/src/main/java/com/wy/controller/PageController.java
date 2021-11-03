package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/express")
    public String express(){
        return "express";
    }
}
