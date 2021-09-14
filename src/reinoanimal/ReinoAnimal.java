package reinoanimal;

public abstract class ReinoAnimal {
    public String nome;
    public String reprodução;
    public String simetria;
    public boolean vertebrado;
    
    public ReinoAnimal(String nome, String reprodução, String simetria, boolean vertebrado) {
        this.nome = nome;
        this.reprodução = reprodução;
        this.simetria = simetria;
        this.vertebrado = vertebrado;
    }
    
    public abstract void locomoção();
    public abstract void status();
}
