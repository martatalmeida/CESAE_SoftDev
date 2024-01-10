import Controllers.AdministradorController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TestAdministradorController {

    AdministradorController administradorController;

    @BeforeEach
    void setUp() throws IOException {
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
    void produtoMaisVendidoTest(){

        assertEquals("Cerveja Super Bock",administradorController.produtoMaisVendido().getProduto());
        assertEquals(1111, administradorController.produtoMaisVendido().getQuantidadeVendida());

        assertNotEquals("Lulas",administradorController.produtoMaisVendido().getProduto());
        assertNotEquals("Tremoços",administradorController.produtoMaisVendido().getProduto());

        assertNotEquals(90,administradorController.produtoMaisVendido().getQuantidadeVendida());
        assertNotEquals(500, administradorController.produtoMaisVendido().getQuantidadeVendida());
    }

    @Test
    void produtoQueMaisVendeuTest(){

        assertEquals("Cerveja Super Bock",administradorController.produtoQueMaisVendeu().getProduto());
        assertEquals(445,administradorController.produtoQueMaisVendeu().getQuantidadeVendida());

        assertNotEquals("Vinho Verde",administradorController.produtoQueMaisVendeu().getProduto());
        assertNotEquals("Pastéis de Nata Congelados",administradorController.produtoQueMaisVendeu().getProduto());

        assertNotEquals(100,administradorController.produtoQueMaisVendeu().getQuantidadeVendida());
        assertNotEquals(440,administradorController.produtoQueMaisVendeu().getQuantidadeVendida());
    }

    @Test
    void vendaMaisValorTest(){

        assertEquals("LGTV OLED 85 Golden Edition",administradorController.vendaMaisValor().getProduto());
        assertEquals(40000.99, administradorController.vendaMaisValor().getPrecoUnitario());

        assertNotEquals("Sabonete Líquido",administradorController.vendaMaisValor().getProduto());
        assertNotEquals("Esfregona",administradorController.vendaMaisValor().getProduto());

        assertNotEquals(1000,administradorController.vendaMaisValor().getPrecoUnitario());
        assertNotEquals(505,administradorController.vendaMaisValor().getPrecoUnitario());
    }

    @Test
    void adicionarUtilizadorTest() throws IOException {

        String path = "src/test/resources/login_grandesNegociosTest.csv";

        administradorController.adicionarUtilizador(path,"ADMIN","tobias","softdev");

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        String tipoUtilizador="";
        String username="";
        String password="";

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");

            tipoUtilizador = linhaDividida[0];
            username = linhaDividida[1];
            password = linhaDividida[2];
        }

        assertEquals("ADMIN", tipoUtilizador);
        assertEquals("tobias",username);
        assertEquals("softdev",password);

        assertNotEquals("FUNC",tipoUtilizador);
        assertNotEquals("tiago",username);
        assertNotEquals("password",password);

        administradorController.adicionarUtilizador(path,"FUNC","marta","almeida");

        File file2 = new File(path);
        Scanner scanner2 = new Scanner(file2);

        tipoUtilizador="";
        username="";
        password="";

        while(scanner2.hasNextLine()){
            String linha2 = scanner2.nextLine();
            String[] linhaDividida2 = linha2.split(";");

            tipoUtilizador = linhaDividida2[0];
            username = linhaDividida2[1];
            password = linhaDividida2[2];
        }

        assertEquals("FUNC", tipoUtilizador);
        assertEquals("marta",username);
        assertEquals("almeida",password);

        assertNotEquals("ADMIN",tipoUtilizador);
        assertNotEquals("tobias",username);
        assertNotEquals("softdev",password);

    }

    @Test
    void adicionarUtilizarInvalidoTest() throws IOException {

        String path = "src/test/resources/login_grandesNegociosTest.csv";

        assertThrows(IllegalArgumentException.class, () ->{
            administradorController.adicionarUtilizador(path,"SEGURANÇA","jeremias","pass");
        });

        assertThrows(IllegalArgumentException.class, () ->{
            administradorController.adicionarUtilizador(path,"CLIENTE","isabel","palavrapasse");
        });

    }

    @Test
    void valorVendasTest(){

    assertEquals(56095.609999999964, administradorController.valorVendas());

    assertNotEquals(10000.50,administradorController.valorVendas());
    assertNotEquals(55050.25,administradorController.valorVendas());

    }

    @Test
    void mediaVendasTest(){
        assertEquals(421.77150375939823, administradorController.mediaVendas());

        assertNotEquals(429,administradorController.mediaVendas());
        assertNotEquals(500,administradorController.mediaVendas());

    }

    @Test
    void getTodasVendasTest(){
        assertEquals(133,administradorController.getTodasVendas().size());
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
