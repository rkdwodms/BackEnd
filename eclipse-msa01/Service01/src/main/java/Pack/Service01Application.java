package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker //exception
@SpringBootApplication
@EnableEurekaClient

public class Service01Application {

	
	@Bean //객체가 무조건 만들어진다.
	@LoadBalanced //아래의 객체가 리본으로서의 역할을 한다. 
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(Service01Application.class, args);
	}

}
