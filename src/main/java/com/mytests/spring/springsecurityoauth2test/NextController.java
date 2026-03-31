package com.mytests.spring.springsecurityoauth2test;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/next")
public class NextController {

    @GetMapping
    public String next(Model model) {
        model.addAttribute("test", "test");
        return "next";
    }
}
