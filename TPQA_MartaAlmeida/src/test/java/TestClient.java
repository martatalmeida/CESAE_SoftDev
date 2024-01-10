import Controllers.ClientController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestClient {

    ClientController clientController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.clientController = new ClientController("src/test/resources/minimercadoTest.csv");
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

    }

    @Test
    void produtosDeCategoriaTest(){

    }

}
