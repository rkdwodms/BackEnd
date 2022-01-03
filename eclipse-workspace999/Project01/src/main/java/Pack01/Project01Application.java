package Pack01;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(value= {"controller"})

public class Project01Application {

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);
	}
	
	/*
     * SqlSessionFactory 설정 
     */
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		//PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource configLocation = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");
		
		sessionFactory.setConfigLocation(configLocation);
		//sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
		return sessionFactory.getObject();
	}



}
