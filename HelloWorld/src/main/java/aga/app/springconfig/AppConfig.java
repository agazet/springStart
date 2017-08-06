package aga.app.springconfig;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aga.app.helloworld.Hello;
import aga.app.lottery.Winner;

@Configuration
public class AppConfig {

	@Bean
	public Hello hello() {
		return new Hello("Mary Lou");
	}

	@Bean
	public Winner winner() {
		List<String> players = Arrays.asList("Lou", "Lui", "Luigi", "Stan", "Mario", "Mary", "Luffy", "Chopper", "Zoro",
				"Sanji", "Nami", "Usopp", "Brook", "Robin");
		return new Winner(players);
	}

}
