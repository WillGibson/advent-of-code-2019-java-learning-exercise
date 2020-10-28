package com.willgibson.adventofcode2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(
        @RequestParam(name = "day", required = false, defaultValue = "all") String day,
        Model model
    ) {
        model.addAttribute("day", day);
        return "home";
    }

}
