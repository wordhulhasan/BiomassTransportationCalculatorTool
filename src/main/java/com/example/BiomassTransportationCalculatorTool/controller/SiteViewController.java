package com.example.BiomassTransportationCalculatorTool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteViewController {

    @GetMapping("/")
    public String homePage(Model model) {
        return "home";
    }
}
