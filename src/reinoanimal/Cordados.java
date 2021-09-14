package reinoanimal;

public abstract class Cordados extends ReinoAnimal{
    public String respiracao;
    public boolean pecilotermico;
    public String epiderme;
    public String habitat;
    
    public Cordados(String nome, String respiracao, boolean pecilotermico, String epiderme, String habitat){
        super(nome, "sexuada", "bilateral", true);
        this.respiracao = respiracao;
        this.pecilotermico = pecilotermico;
        this.epiderme = epiderme;
        this.habitat = habitat;
    }

}
