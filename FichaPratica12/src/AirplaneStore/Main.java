package AirplaneStore;

public class Main {

    public static void main(String[] args) {

        JatoPrivado jato1 = new JatoPrivado(1,"Jato Privado-17",2020,2000,20,10,5,4,500,400,5000,30,40,CategoriaJato.Midsize_Jet);
        AviaoCombate combate1 = new AviaoCombate(2, "Aviao Combate-15",2018,4000,30,10,10,4,600,500,10000,"Portugal",true);

        Catalogo catalogo = new Catalogo();

        jato1.inserirInstalacao(Instalacoes.WC);
        jato1.inserirInstalacao(Instalacoes.Cozinha);
        jato1.inserirInstalacao(Instalacoes.Tomadas);


        combate1.inserirArma(Armas.Bombas);
        combate1.inserirArma(Armas.Metralhadoras);
        combate1.inserirArma(Armas.Torpedos);


        catalogo.adquirirAviao(jato1);
        catalogo.adquirirAviao(combate1);


        catalogo.listarCatalogo();
        System.out.println("");

        double precoCatalogo = catalogo.calcularTotal();
        System.out.println("\nPreço Total do Catalogo: " + precoCatalogo);

    }

}
