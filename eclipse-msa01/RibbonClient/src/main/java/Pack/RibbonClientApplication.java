package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
// 여기가 항상 프로젝트의 시작이다. 
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableCircuitBreaker
public class RibbonClientApplication {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientApplication.class, args);
	}

}
