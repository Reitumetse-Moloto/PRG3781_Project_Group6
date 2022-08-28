package com.project.appuser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

@Controller
public class AppController {
    
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
}
