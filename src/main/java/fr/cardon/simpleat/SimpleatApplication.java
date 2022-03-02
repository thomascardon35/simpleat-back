package fr.cardon.simpleat;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import fr.cardon.simpleat.exception.ExistingUsernameException;
import fr.cardon.simpleat.model.EnumRole;
import fr.cardon.simpleat.model.Personne;
import fr.cardon.simpleat.service.PersonneService;

@SpringBootApplication
public class SimpleatApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(SimpleatApplication.class, args);
	}
	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
   


}
