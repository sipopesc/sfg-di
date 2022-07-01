package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller // this tells SpringFramework to manage it and inject it where needed
public class MyController {

    private final GreetingService greetingService;

    // No need for @Autowired since it's Constructor injected bean
    // and no need for @Qualifier - Primary bean will be injected
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String saySalut() {
        return greetingService.sayGreeting();
//		System.out.println("salut din sysout din metoda saySalut");
//
//		return "salut! asta e un string returnat de metoda saySalut";
    }

}
