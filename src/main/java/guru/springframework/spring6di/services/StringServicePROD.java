package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("stringService")
public class StringServicePROD implements StringService {

    @Override
    public String returnString() {
        return "This is the PROD environment.";
    }
}
