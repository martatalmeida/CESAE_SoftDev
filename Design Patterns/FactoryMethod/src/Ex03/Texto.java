package Ex03;

public class Texto extends Document{

    public Texto(String autor, String nome, String extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de texto " + super.getNome() + super.getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações de " + super.getAutor() + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de texto");
    }
}
