package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeroController {

    private Hero hero;

    @Autowired
    public HeroController(@Qualifier("superHero") Hero hero) {
        this.hero = hero;
    }

    @RequestMapping("/api")
    public String sendHeroOnQuest() {
        hero.sendOnQuest("Petúnio", "Barbarian", "defeat the goblin lord");
        return "Hero sent!";

    }
}
