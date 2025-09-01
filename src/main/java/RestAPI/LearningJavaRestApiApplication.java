package RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"RestAPI", "Services", "Models", "Repository", "Controllers"})
public class LearningJavaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningJavaRestApiApplication.class, args);
	}

}