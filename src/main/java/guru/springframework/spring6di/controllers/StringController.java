package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class StringController {

    private final StringService stringService;

    @Autowired
    public StringController(@Qualifier("stringService") StringService stringService) {
        this.stringService = stringService;
    }

    public String showString() {
        return stringService.returnString();
    }
}
