package com.study.lol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/item")
@RestController
public class ItemController {

    @GetMapping("")
    public String fetchAll() {
        return "Hello World";
    }

}
