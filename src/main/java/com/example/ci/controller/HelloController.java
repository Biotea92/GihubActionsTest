package com.example.ci.controller;

import com.example.ci.config.SiteProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final SiteProperties siteProperties;

    @GetMapping("/")
    public String hello() {
        return siteProperties.getAuthorName();
    }
}
