package com.example.demo.hero;

import com.example.demo.controller.Hero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RpgHero implements Hero {
    @Override
    public void sendOnQuest(String heroName, String heroClass, String quest) {
        log.info("D&D hero "+ heroName );
        log.info("of class "+ heroClass );
        log.info("is going to "+ quest );
    }
}
