package Ex05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFuncionario {

    Funcionario funcionario1;
    Funcionario funcionario2;

    @BeforeEach
    public void setUp(){
        this.funcionario1 = new Funcionario("Marta",50,"Softdev");
        this.funcionario2 = new Funcionario("Isabel",100,"Comunicacao");
    }

    @Test
    public void aumentarSalarioTest(){
        assertEquals(60,funcionario1.aumentarSalario(0.2));
        assertEquals(130, funcionario2.aumentarSalario(0.3));
    }

    @Test
    public void exibirDadosTest(){
        assertEquals("Marta", funcionario1.getNome());
        assertEquals(50, funcionario1.getSalario());
        assertEquals("Softdev", funcionario1.getDepartamento());
    }

}
