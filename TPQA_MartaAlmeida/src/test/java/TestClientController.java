import Controllers.ClientController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TestClientController {

    ClientController clientController;

    @BeforeEach
    void setUp() throws IOException {
        this.clientController = new ClientController("src/test/resources/minimercadoTest.csv");


        File fileTest = new File("src/test/resources/minimercadoTest.csv");
        File fileOriginal = new File("src/test/resources/minimercadoTestOriginal.csv");

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
    void produtoMaisCaroTest(){

        assertEquals("Produtos para Casa",clientController.produtoMaisCaro().getTipoProduto());
        assertEquals("LGTV OLED 85 Golden Edition",clientController.produtoMaisCaro().getProduto());
        assertEquals(40000.99, clientController.produtoMaisCaro().getPrecoUnitario());

        assertNotEquals("Conjunto de Talheres", clientController.produtoMaisCaro().getProduto());
        assertNotEquals("Baldes de Reciclagem",clientController.produtoMaisCaro().getProduto());

        assertNotEquals(25.99,clientController.produtoMaisCaro().getPrecoUnitario());
        assertNotEquals(1000,clientController.produtoMaisCaro().getPrecoUnitario());
    }

    @Test
    void produtoMaisBaratoTest(){
        assertEquals("Alimentacao",clientController.produtoMaisBarato().getTipoProduto());
        assertEquals("Pate de Sardinha",clientController.produtoMaisBarato().getProduto());
        assertEquals(0.65,clientController.produtoMaisBarato().getPrecoUnitario());

        assertNotEquals("Cerveja Super Bock",clientController.produtoMaisBarato().getProduto());
        assertNotEquals("Pilhas AA",clientController.produtoMaisBarato().getProduto());

        assertNotEquals(0.99,clientController.produtoMaisBarato().getPrecoUnitario());
        assertNotEquals(1.99,clientController.produtoMaisBarato().getPrecoUnitario());
    }

    @Test
    void produtosDisponiveisSemDuplicadosTest(){

        assertEquals(108,clientController.produtosDisponiveisSemDuplicados().size());
        assertNotEquals(105,clientController.produtosDisponiveisSemDuplicados().size());

        boolean duplicado = false;

        for (int i = 0; i < clientController.produtosDisponiveisSemDuplicados().size(); i++){
            duplicado = false;
            for (int c = i+1; c < clientController.produtosDisponiveisSemDuplicados().size(); c++){
                if(clientController.produtosDisponiveisSemDuplicados().get(i).getProduto().equals(clientController.produtosDisponiveisSemDuplicados().get(c).getProduto())){
                    duplicado = true;
                }
            }
        }

        assertFalse(duplicado);

    }

    @Test
    void produtosDeCategoriaTest(){
        assertEquals(44,clientController.produtosDeCategoria("Alimentacao").size());
        assertEquals(30,clientController.produtosDeCategoria("Higiene").size());
        assertEquals(34,clientController.produtosDeCategoria("Produtos para Casa").size());
        assertNotEquals(32,clientController.produtosDeCategoria("Higiene").size());

        boolean outraCategoria = false;

        for (int i = 0; i < clientController.produtosDeCategoria("Alimentacao").size(); i++){
            outraCategoria = false;
            if(!clientController.produtosDeCategoria("Alimentacao").get(i).getTipoProduto().equals("Alimentacao")){
                outraCategoria = true;
            }
        }

        assertFalse(outraCategoria);

        for (int i = 0; i < clientController.produtosDeCategoria("Higiene").size(); i++){
            outraCategoria = false;
            if(!clientController.produtosDeCategoria("Higiene").get(i).getTipoProduto().equals("Higiene")){
                outraCategoria = true;
            }
        }

        assertFalse(outraCategoria);
    }

    @Test
    void getTodasVendasTest(){
        assertEquals(133,clientController.getTodasVendas().size());
    }

    @AfterEach
    void tearDown() throws IOException {
        File fileTest = new File("src/test/resources/minimercadoTest.csv");
        File fileOriginal = new File("src/test/resources/minimercadoTestOriginal.csv");

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
