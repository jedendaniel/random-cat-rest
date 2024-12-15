package com.ddd.cat.view;

import com.ddd.cat.service.RandomCatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class HomeController {
    private final RandomCatService randomCatService;
    public HomeController(RandomCatService randomCatService) {
        this.randomCatService = randomCatService;
    }

    @GetMapping({"/", "/index", "/home"})
    public String index() {
        return "Hello world";
    }

    @GetMapping("/cat")
    public byte[] cat(Model model) {
        return randomCatService.getRandomCatPic();
    }
}
