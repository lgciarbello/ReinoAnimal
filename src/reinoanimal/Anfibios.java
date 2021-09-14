package reinoanimal;

public class Anfibios extends Cordados{

    public Anfibios(String nome) {
        super(nome, "branquial/pulmonar", true, "pegajosa", "aquático/terrestre", "anfibio");
    }

    @Override
    public void locomoção() {
        System.out.println("Pulam\n");
    }

    @Override
    public void status() {
        System.out.println("INFORMAÇÕES DO ANIMAL");
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Reprodução: " + this.reprodução);
        System.out.println("Simetria: " + this.simetria);
        System.out.println("Vertebrado: " + this.vertebrado);
        System.out.println("Respiração: " + this.respiracao);
        System.out.println("Pecilotermico: " + this.pecilotermico);
        System.out.println("Habitat: " + this.habitat);
        System.out.println(" ");
    }
    
}
