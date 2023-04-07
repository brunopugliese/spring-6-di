package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("stringService")
public class StringServiceQA implements StringService {

    @Override
    public String returnString() {
        return "This is the QA environment.";
    }
}
