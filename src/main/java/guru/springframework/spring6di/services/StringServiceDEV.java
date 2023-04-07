package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("stringService")
public class StringServiceDEV implements StringService {

    @Override
    public String returnString() {
        return "This is the DEV environment.";
    }
}
