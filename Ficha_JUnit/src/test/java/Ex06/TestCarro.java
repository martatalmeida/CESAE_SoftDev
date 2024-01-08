package Ex06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestCarro {

    Carro carro1;
    Carro carro2;
    Carro carro3;
    Carro carro4;
    Carro carro5;

    @BeforeEach
    public void setUp(){
        this.carro1 = new Carro("Fiat","500",2020,150,100,TipoCombustivel.Gasolina,4.5);
        this.carro2 = new Carro("Mini","Cooper",2016,250,150,TipoCombustivel.Diesel,5);
        this.carro3 = new Carro("Audi", "A4",2018,200,200,TipoCombustivel.Diesel,5.5);
        this.carro4 = new Carro("Jaguar", "J6", 2018,200,200,TipoCombustivel.Diesel,5.5);
        this.carro5 = new Carro("Jaguar", "J6", 1990,200,200,TipoCombustivel.Diesel,5.5);
    }

    @Test
    public void ligarTest(){
        assertEquals("O carro está ligado!\nVrummmmmmmmmmmm",carro1.ligar());
        assertEquals("O carro está ligado!\nVRUMMMMMMMM",carro2.ligar());
        assertEquals("Deita um pouco de fumo... Custa a pegar... O carro está ligado!\nVrum-vrum-vrum",carro5.ligar());

    }

    @Test
    public void corridaTest(){
        assertEquals(carro2,carro1.corrida(carro2));
        assertEquals(carro3,carro1.corrida(carro3));
        assertEquals(carro2,carro2.corrida(carro3));
        assertEquals(carro4,carro4.corrida(carro1));
        assertNull(carro4.corrida(carro3));
    }

    @Test
    public void consumoCombustivelTest(){
        assertEquals(450,carro1.consumoCombustivel(100));
        assertEquals(360,carro1.consumoCombustivel(80));
        assertEquals(250,carro2.consumoCombustivel(50));
        assertEquals(715,carro3.consumoCombustivel(130));
    }




}
