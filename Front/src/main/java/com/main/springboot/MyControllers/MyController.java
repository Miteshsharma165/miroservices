package com.main.springboot.MyControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.springboot.services.GetPostRepository;
import com.main.springboot.services.GetPostService;


@Controller
public class MyController {
	
	@Autowired
     private GetPostRepository  jobPost;

	@RequestMapping("/")
	public String home(Model model) {
		 List<GetPostService> list=jobPost.findAll();
		 System.err.println(list);
		 model.addAttribute("postList",list);
		 return "index";
	}
}
