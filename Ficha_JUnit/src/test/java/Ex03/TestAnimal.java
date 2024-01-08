package Ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnimal {

    Animal animal;

    @BeforeEach
    public void setUp(){
        this.animal = new Animal("Archie",Alimento.CARNE);
    }

    @Test
    public void getNomeTest(){

        assertEquals("Archie",animal.getNome());

    }

    @Test
    public void estaComFomeTest(){

        assertTrue(animal.estaComFome());

    }

    @Test
    public void getTipoAlimentacaoTest(){

        assertEquals(Alimento.CARNE,animal.getTipoAlimentacao());

    }

    @Test
    public void comerTest(){

    

    }

}
