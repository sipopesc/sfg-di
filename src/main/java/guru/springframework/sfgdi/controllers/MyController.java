package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String saySalut() {
		System.out.println("salut din sysout din metoda");
		
		return "salut din return";
	}

}
