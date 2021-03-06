package com.example.sbwebapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebpageController {

	@RequestMapping("ecomoto.com")
	public String webhomepage() {
		System.out.println("ecomoto hompage is started!");
		return "index.html";
                     		
	}@RequestMapping("ecomotojsp")
	public String jsphomepage() {
		System.out.println("ecomoto JSP hompage is started!");
		return "home";
                     		
	}
}
