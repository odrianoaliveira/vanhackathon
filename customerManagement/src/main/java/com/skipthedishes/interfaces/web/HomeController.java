package com.skipthedishes.interfaces.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static java.lang.System.out;

/**
 * Home redirection to swagger api documentation 
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
