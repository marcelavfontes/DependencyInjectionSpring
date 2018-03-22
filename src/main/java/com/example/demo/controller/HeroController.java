package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import otherpackage.OtherClass;


@RestController
public class HeroController {

    private Hero hero;

    private OtherClass other;

    @Autowired
    public HeroController(@Qualifier("superHero") Hero hero, OtherClass other) {
        this.hero = hero;
        this.other = other;
    }

    @RequestMapping("/api")
    public String sendHeroOnQuest() {
        hero.sendOnQuest("Petúnio", "Barbarian", "defeat the goblin lord");
        return other.hello();

    }
}
