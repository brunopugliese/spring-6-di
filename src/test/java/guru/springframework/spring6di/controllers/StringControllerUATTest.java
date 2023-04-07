package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"UAT","EN"})
@SpringBootTest
class StringControllerUATTest {

    @Autowired
    StringController stringController;

    @Test
    void showString() {
        System.out.println(stringController.showString());
    }
}