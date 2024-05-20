package com.example.sorteio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "API de sorteio de números",
		description = "Sorteia números de 1 a 6 e também entre 1 e o número definido",
		contact = @Contact(name = "Kauê Braz", email = "rm97768@fiap.com.br"),
		version = "1.0.0"
	)
)
public class SorteioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SorteioApplication.class, args);
	}

}
