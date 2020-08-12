package com.example.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 学无止境~冲
 */
@Controller
@RequestMapping(value = "/test",produces = "application/json; charset=UTF-8")
public class TestFile {

    @RequestMapping("/upload")
    public String start() throws Exception {
        return "/upload.html";
    }

}