package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller // this tells SpringFramework to manage it and inject it where needed
public class MyController {
	
	public String saySalut() {
		System.out.println("salut din sysout din metoda saySalut");
		
		return "salut! asta e un string returnat de metoda saySalut";
	}

}
