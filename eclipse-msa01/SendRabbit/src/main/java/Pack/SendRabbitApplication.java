package Pack;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


// 이 파일이 시작페이지임!

@SpringBootApplication
public class SendRabbitApplication {
	
	@Bean
	Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}


	public static void main(String[] args) {
		SpringApplication.run(SendRabbitApplication.class, args);
	}

}
