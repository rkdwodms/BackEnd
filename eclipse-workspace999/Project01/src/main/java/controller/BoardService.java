package controller;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardService {
	
	 
    @Autowired
    BoardMapper boardMapper;
    
    public String now() throws Exception {
        return boardMapper.now();


    }
}
