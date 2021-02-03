package vn.com.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("vn.com.rabbit.entity")
@ComponentScan(basePackages = { "vn.com.rabbit", "vn.com.rabbit.service" })
public class TheRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheRabbitApplication.class, args);
	}

}
