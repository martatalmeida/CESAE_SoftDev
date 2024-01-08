package Ex04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRetangulo {

    Retangulo retangulo1;
    Retangulo retangulo2;

    @BeforeEach
    public void setUp(){
        this.retangulo1 = new Retangulo(10,10);
        this.retangulo2 = new Retangulo(2,5);
    }

    @Test
    public void calcularAreaTest(){
        assertEquals(100,retangulo1.calcularArea());
        assertEquals(10,retangulo2.calcularArea());
    }

    @Test
    public void calcularPerimetroTest(){
        assertEquals(40, retangulo1.calcularPerimetro());
        assertEquals(14,retangulo2.calcularPerimetro());
    }

}
