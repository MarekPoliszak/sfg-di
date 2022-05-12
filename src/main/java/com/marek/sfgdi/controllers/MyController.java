package com.marek.sfgdi.controllers;

import com.marek.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.awt.*;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
