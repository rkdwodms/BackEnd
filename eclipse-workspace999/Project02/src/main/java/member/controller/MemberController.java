package member.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import member.service.BoardService;
import member.service.UserService;
import member.vo.BoardVO;

public class MemberController {
	private BoardService bService;
	private UserService uService;
	
	public MemberController(BoardService b,UserService u) {
		this.bService=b;
		this.uService=u;
	}
	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}
	@RequestMapping("/register")
	public String register(Model model) {
		return "register";
	}
	@RequestMapping("/select")
	public String select(Model model) {
		List<BoardVO> boardList=bService.getBoardList();
		model.addAttribute("postList",boardList);
		return "select";
	}
	@RequestMapping("/write")
	public String write(Model model) {
		return "write";
	}
	@RequestMapping("/delete")
	public String delete(Model model) {
		return "delete";
	}
	@RequestMapping("/withdraw")
	public String withdraw(Model model) {
		return "withdraw";
	}
	@RequestMapping("/user")
	public String user(Model model) {
		return "user";
	}

}
