package reinoanimal;

public class Peixes extends Cordados implements Interface{

    public Peixes(String nome) {
        super(nome, "branquial", true, "escamas", "aquatico", "peixe");
    }
    
    @Override
    public void locomoção() {
        System.out.println("Nadando\n");
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

    @Override
    public void comer() {
        System.out.println("Comendo...");
    }

    @Override
    public void urinar() {
        System.out.println("Urinando...");
    }
    
}
