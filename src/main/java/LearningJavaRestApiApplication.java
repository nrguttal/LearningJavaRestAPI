package restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"restapi", "services", "models", "repository", "controllers"})
public class LearningJavaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningJavaRestApiApplication.class, args);
	}

}