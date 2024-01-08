package Ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnimal {

    Animal animal;
    Animal animal2;

    @BeforeEach
    public void setUp(){
        this.animal = new Animal("Archie",Alimento.CARNE);
        this.animal2= new Animal("Gato",Alimento.PEIXE);
    }

    @Test
    public void getNomeTest(){

        assertEquals("Archie",animal.getNome());
        assertEquals("Gato", animal2.getNome());
    }

    @Test
    public void getTipoAlimentacaoTest(){

        assertEquals(Alimento.CARNE,animal.getTipoAlimentacao());
        assertEquals(Alimento.PEIXE,animal2.getTipoAlimentacao());

    }

    @Test
    public void estaComFomeTest(){

        assertTrue(animal.estaComFome());
        assertTrue(animal2.estaComFome());
        animal.comer(Alimento.FRUTAS);
        assertTrue(animal.estaComFome());
        animal.comer(animal.getTipoAlimentacao());
        assertFalse(animal.estaComFome());
        animal2.comer(animal2.getTipoAlimentacao());
        assertFalse(animal.estaComFome());
    }

}
