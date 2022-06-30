package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingSerice implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Salut din ConstructorGreetingService";
	}

}
