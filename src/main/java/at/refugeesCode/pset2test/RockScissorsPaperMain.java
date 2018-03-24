package at.refugeesCode.pset2test;


import at.refugeesCode.pset2test.controller.RockScissorsPaperGame;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RockScissorsPaperMain {

    @Bean
    ApplicationRunner applicationRunner () {
        return args -> {
            new RockScissorsPaperGame().play();
        };
    }
}
