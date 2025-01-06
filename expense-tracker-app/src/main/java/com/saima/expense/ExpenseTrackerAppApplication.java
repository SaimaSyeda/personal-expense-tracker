package com.saima.expense;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
		info = @Info(
				title = "Expense Tracker REST API Documentation",
				description = "Expense Tracker REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Saima",
						email = "saimafatima417@gmail.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Expense Tracker REST API Documentation for Developers"
		)
)
@SpringBootApplication
public class ExpenseTrackerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerAppApplication.class, args);
	}

}
