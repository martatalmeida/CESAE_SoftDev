package Ex07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestConta {

    Conta conta1;
    Conta conta2;

    @BeforeEach
    void setUp(){
        this.conta1 = new Conta(1,500,"Marta");
        this.conta2 = new Conta(2,1000,"Isabel");
    }

    @Test
    void pedirEmprestimoTest(){
        assertFalse(conta1.pedirEmprestimo(470));
        assertTrue(conta1.pedirEmprestimo(100));
        assertEquals(600,conta1.getSaldo());
        assertTrue(conta2.pedirEmprestimo(400));
        assertEquals(1400,conta2.getSaldo());
        assertFalse(conta1.pedirEmprestimo(500));
        assertEquals(600,conta1.getSaldo());
        assertFalse(conta2.pedirEmprestimo(1050));
    }

    @Test
    void transferenciaTest(){
        assertTrue(conta1.transferencia(200,conta2));
        assertEquals(300,conta1.getSaldo());
        assertTrue(conta2.transferencia(300,conta1));
        assertEquals(900,conta2.getSaldo());
        assertFalse(conta1.transferencia(700,conta2));
        assertEquals(600,conta1.getSaldo());
        assertFalse(conta2.transferencia(1000,conta2));
        assertEquals(900,conta2.getSaldo());
    }

    @Test
    void depositarTest(){
        assertEquals(800,conta1.depositar(300));
        assertEquals(1500,conta2.depositar(500));
    }

    @Test
    void levantarTest(){
        assertTrue(conta1.levantar(200));
        assertEquals(300,conta1.getSaldo());
        assertTrue(conta2.levantar(800));
        assertEquals(200,conta2.getSaldo());
        assertFalse(conta1.levantar(400));
        assertEquals(300,conta1.getSaldo());
        assertFalse(conta2.levantar(2000));
        assertEquals(200,conta2.getSaldo());
    }

}
