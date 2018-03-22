package com.example.demo.controller;

import com.example.demo.hero.RpgHero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeroController {

    private Hero hero = new RpgHero();

    @RequestMapping("/api")
    public String sendHeroOnQuest(){
        hero.sendOnQuest("Petúnio", "Barbarian", "defeat the goblin lord");
        return "rpgHero sent!";

    }
}
