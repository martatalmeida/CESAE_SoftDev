package Ex03;

public class Apresentacao extends Document{

    public Apresentacao(String autor, String nome, String extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void open() {
        System.out.println("A abrir a apresentaçao " + super.getNome() + "." + super.getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + super.getAutor() + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar a apresentaçao");
    }
}
