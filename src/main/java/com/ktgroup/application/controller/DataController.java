package com.ktgroup.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

    @GetMapping(value = { "/list-data"})
    public String welcomePage(Model model) {
        return "list-data";
    }
}
