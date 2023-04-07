package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("stringService")
public class StringServiceUAT implements StringService {

    @Override
    public String returnString() {
        return "This is the UAT environment.";
    }
}
