package guru.springframework.sfgdi.services;

//@Service - used GreetingServiceConfig class
public class ConstructorInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Salut din ConstructorGreetingService";
    }

}
