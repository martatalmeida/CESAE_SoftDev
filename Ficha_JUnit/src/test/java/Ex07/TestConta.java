package Ex07;

import org.junit.jupiter.api.BeforeEach;

public class TestConta {

    Conta conta1;
    Conta conta2;

    @BeforeEach
    void setUp(){
        this.conta1 = new Conta(1,500,"Marta");
        this.conta2 = new Conta(2,1000,"Isabel");
    }

}
