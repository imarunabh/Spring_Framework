package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
@RequestMapping("/home")
	public String display()
	{
	System.out.println("This is console");
		return "index";
	}

@RequestMapping("/about")
public String about()
{
System.out.println("This is about console");
	return "about";
}

	
}
