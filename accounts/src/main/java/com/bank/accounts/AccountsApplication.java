package com.bank.accounts;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Bank accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Abimael R Sergio",
						email = "abimaelr.sergio@gmail.com",
						url = "https://www.linkedin.com/in/abimaelsergio"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Accounts microservice REST API Documentation",
				url = "https://github.com/abimaelrsergio/bank/blob/main/README.md"
		)
)
/*@ComponentScans({@ComponentScan("com.bank.new.accounts.controller"}))
@EnableJpaRepositories("com.bank.new.accounts.repository")
@EntityScan("com.bank.new.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@SpringBootApplication
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
