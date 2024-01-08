package Ex03;

public class DocumentFactory {

    public static Document criarDocumento(String tipoDocumento, String autor, String nome){
        tipoDocumento = tipoDocumento.toLowerCase();
        switch (tipoDocumento){
            case "texto":
                return new Texto(autor, nome, ".docx");
            case "calculo":
                return new FolhaCalculo(autor, nome, ".xlsx");
            case "apresentacao":
                return new Apresentacao(autor, nome, ".pptx");
            default:
                throw new IllegalArgumentException("Tipo de documento inválido: " + tipoDocumento);
        }
    }

}
