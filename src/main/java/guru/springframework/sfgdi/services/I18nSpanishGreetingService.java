package guru.springframework.sfgdi.services;

//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Service;

//@Profile({"ES", "default"}) //we can have a list of profiles
//@Service("i18nService")  // the bean in the app contex will be named i18nService
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola - from ES profile";
    }
}
