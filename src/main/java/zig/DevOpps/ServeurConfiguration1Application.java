package zig.DevOpps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServeurConfiguration1Application {
	
	@GetMapping("/bonjour")
	public String bonjour() {
		return "Bonjour M2 Génie Logiciel";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServeurConfiguration1Application.class, args);
	}

}
