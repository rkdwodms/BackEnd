package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker //exception
@SpringBootApplication
public class Apple02Application {

	public static void main(String[] args) {
		SpringApplication.run(Apple02Application.class, args);
	}

}
