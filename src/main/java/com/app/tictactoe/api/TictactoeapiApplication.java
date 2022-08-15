package com.app.tictactoe.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.app.tictactoe")
public class TictactoeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictactoeapiApplication.class, args);
	}

}
