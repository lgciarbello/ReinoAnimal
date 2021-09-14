package reinoanimal;

public class Mamiferos extends Cordados{

    public Mamiferos(String nome) {
        super(nome, "pulmonar", false, "pelos", "terrestre", "mamifero");
    }

    @Override
    public void locomoção() {
        System.out.println("Andam\n");
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
        System.out.println("");
    }
    
}
