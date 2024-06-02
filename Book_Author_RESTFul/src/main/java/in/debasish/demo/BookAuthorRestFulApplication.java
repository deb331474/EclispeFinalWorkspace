package in.debasish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "in.debasish.demo")
public class BookAuthorRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAuthorRestFulApplication.class, args);
	} 

}
