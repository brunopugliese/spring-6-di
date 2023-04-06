package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From the Setter Injected Bean!!";
    }

}
