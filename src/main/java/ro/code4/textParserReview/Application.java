package ro.code4.textParserReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan("ro.code4")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
