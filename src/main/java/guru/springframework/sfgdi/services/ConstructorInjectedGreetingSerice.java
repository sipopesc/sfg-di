package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingSerice implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Salut din ConstructorGreetingService";
	}

}
