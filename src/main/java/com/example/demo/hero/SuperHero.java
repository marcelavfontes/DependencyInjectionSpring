package com.example.demo.hero;

import com.example.demo.controller.Hero;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SuperHero implements Hero {
    @Override
    public void sendOnQuest(String heroName, String heroClass, String quest) {
        log.info("Super hero "+ heroName );
        log.info("of class "+ heroClass );
        log.info("is going to "+ quest );
    }
}
