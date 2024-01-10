import Controllers.LoginController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLogin {

    LoginController loginController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.loginController = new LoginController("src/test/resources/login_grandesNegociosTest.csv");
    }

    @Test
    void validarLoginTest(){
        assertTrue(loginController.validarLogin("ADMIN","softdev","softdev"));
        assertTrue(loginController.validarLogin("FUNC","quim","formacaoDramatica"));

        assertFalse(loginController.validarLogin("ADMIN","tiago","password"));
        assertFalse(loginController.validarLogin("FUNC","tiago","softdev"));
        assertFalse(loginController.validarLogin("CLIENTE","marta","password"));
        assertFalse(loginController.validarLogin("CLIENTE","softdev","softdev"));
        assertFalse(loginController.validarLogin("ADMIN","patrao","senha"));
    }

}
