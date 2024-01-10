import Controllers.AdministradorController;
import Controllers.LoginController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginController {

    LoginController loginController;
    AdministradorController administradorController;

    @BeforeEach
    void setUp() throws IOException {
        this.loginController = new LoginController("src/test/resources/login_grandesNegociosTest.csv");
        this.administradorController = new AdministradorController("src/test/resources/minimercadoTest.csv");

        File fileTest = new File("src/test/resources/login_grandesNegociosTest.csv");
        File fileOriginal = new File("src/test/resources/login_grandesNegociosTestOriginal.csv");

        FileWriter fw = new FileWriter(fileTest);
        Scanner sc = new Scanner(fileOriginal);

        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            fw.write(linha);
            if(sc.hasNextLine()){
                fw.write("\n");
            }
        }
        fw.close();
    }


    @Test
    void validarLoginTest() throws IOException {
        assertTrue(loginController.validarLogin("ADMIN","softdev","softdev"));
        assertTrue(loginController.validarLogin("ADMIN","patrao","grandesnegocios"));
        assertTrue(loginController.validarLogin("FUNC","quim","formacaoDramatica"));
        assertTrue(loginController.validarLogin("FUNC","lara","bolinhosDeChocolate"));
        administradorController.adicionarUtilizador("src/test/resources/login_grandesNegociosTest.csv","FUNC","marta","almeida");
        loginController = new LoginController("src/test/resources/login_grandesNegociosTest.csv");
        assertTrue(loginController.validarLogin("FUNC","marta","almeida"));

        assertFalse(loginController.validarLogin("ADMIN","tiago","password"));
        assertFalse(loginController.validarLogin("FUNC","tiago","softdev"));
        assertFalse(loginController.validarLogin("CLIENTE","marta","password"));
        assertFalse(loginController.validarLogin("CLIENTE","softdev","softdev"));
        assertFalse(loginController.validarLogin("ADMIN","patrao","senha"));
    }

    @AfterEach
    void tearDown() throws IOException {
        File fileTest = new File("src/test/resources/login_grandesNegociosTest.csv");
        File fileOriginal = new File("src/test/resources/login_grandesNegociosTestOriginal.csv");

        FileWriter fw = new FileWriter(fileTest);
        Scanner sc = new Scanner(fileOriginal);

        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            fw.write(linha);
            if(sc.hasNextLine()){
                fw.write("\n");
            }
        }
        fw.close();
    }

}
