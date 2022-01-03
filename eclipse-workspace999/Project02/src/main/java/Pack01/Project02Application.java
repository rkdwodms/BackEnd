package Pack01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import member.dao.BoardMapper;
import member.dao.UserMapper;
import member.service.BoardService;
import member.service.UserService;
import member.vo.BoardVO;
import member.vo.UserVO;

@SpringBootApplication
public class Project02Application {
    
    public static void main(String[] args) throws Exception{
    	
    	SpringApplication.run(Project02Application.class, args);
		
	}
}
