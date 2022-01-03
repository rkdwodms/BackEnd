package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class BoradController {
	@Autowired 
	BoardService boardService;
	 
	    // MYSQL test
	    @RequestMapping(value="/index")
	    public String now(Model model) throws Exception {
	        
	        model.addAttribute("index", boardService.now());
	        return "index";
	    }



}
