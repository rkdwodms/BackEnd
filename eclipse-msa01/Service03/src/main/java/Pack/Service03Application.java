package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class Service03Application {

	public static void main(String[] args) {
		SpringApplication.run(Service03Application.class, args);
	}

}
