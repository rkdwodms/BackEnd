package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service77Application {

	public static void main(String[] args) {
		SpringApplication.run(Service77Application.class, args);
	}

}
