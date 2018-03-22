package hero;

import com.example.demo.Hero;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RpgHero implements Hero {
    @Override
    public void sendOnQuest(String heroName, String heroClass, String quest) {
        log.info("The hero "+ heroName );
        log.info("of class "+ heroClass );
        log.info("is going to "+ quest );
    }
}
