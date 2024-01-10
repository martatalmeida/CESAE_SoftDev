import Controllers.FuncionarioController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFuncionario {

    FuncionarioController funcionarioController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.funcionarioController = new FuncionarioController("src/test/resources/minimercadoTest.csv");
    }

    @Test
    void addVendaTest() throws IOException {
        String path = "src/test/resources/minimercadoTest.csv";

        funcionarioController.addVenda(path,"Alimentacao","Vinho Branco",5,8.99);

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        String tipoProduto="";
        String nomeProduto="";
        String quantidade= "";
        String preco= "";

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            String[] linhaDividida = linha.split(",");

            tipoProduto = linhaDividida[0];
            nomeProduto = linhaDividida[1];
            quantidade = linhaDividida[2];
            preco = linhaDividida[3];
        }

        assertEquals("Alimentacao", tipoProduto);
        assertEquals("Vinho Branco",nomeProduto);
        assertEquals("5",quantidade);
        assertEquals("8.99",preco);

        assertNotEquals("Produtos para Casa",tipoProduto);
        assertNotEquals("Vinho Verde",nomeProduto);
        assertNotEquals("44",quantidade);
        assertNotEquals("5.5",preco);

        funcionarioController.addVenda(path,"Higiene","Esfoliante Corporal",12,10.90);

        File file2 = new File(path);
        Scanner scanner2 = new Scanner(file2);

        tipoProduto="";
        nomeProduto="";
        quantidade= "";
        preco= "";

        while(scanner2.hasNextLine()){
            String linha2 = scanner2.nextLine();
            String[] linhaDividida2 = linha2.split(",");

            tipoProduto = linhaDividida2[0];
            nomeProduto = linhaDividida2[1];
            quantidade = linhaDividida2[2];
            preco = linhaDividida2[3];
        }

        assertEquals("Higiene", tipoProduto);
        assertEquals("Esfoliante Corporal",nomeProduto);
        assertEquals("12",quantidade);
        assertEquals("10.9",preco);

        assertNotEquals("Alimentacao", tipoProduto);
        assertNotEquals("Vinho Branco",nomeProduto);
        assertNotEquals("5",quantidade);
        assertNotEquals("8.99",preco);
    }

    @Test
    void addVendaInvalidaTest(){
        String path = "src/test/resources/minimercadoTest.csv";

        assertThrows(IllegalArgumentException.class, () ->{
            funcionarioController.addVenda(path,"Comida","Pao de Forma",10,2.99);
        });

        assertThrows(IllegalArgumentException.class, () ->{
            funcionarioController.addVenda(path,"Roupa","Camisola",15,10.5);
        });
    }

    @Test
    void consultarStockProdutoTest(){

        assertEquals(89,funcionarioController.consultarStockProduto("Cerveja Super Bock"));
        assertEquals(1037,funcionarioController.consultarStockProduto("Tremoços"));
        assertEquals(1175,funcionarioController.consultarStockProduto("Lulas"));
        assertEquals(906,funcionarioController.consultarStockProduto("Vinho Verde"));

        assertNotEquals(1100,funcionarioController.consultarStockProduto("Pate de Sardinha"));
        assertNotEquals(500,funcionarioController.consultarStockProduto("Vinho Verde"));
        assertNotEquals(1200,funcionarioController.consultarStockProduto("Cerveja Super Bock"));
        assertNotEquals(1038,funcionarioController.consultarStockProduto("Tremoços"));

    }

    @AfterEach
    void tearDown(){

    }

}
