package reinoanimal;

public class Peixes extends Cordados{

    public Peixes(String nome, String respiracao, boolean pecilotermico, String epiderme, String habitat) {
        super(nome, "branquial", true, "escamas", "aquatico");
    }
    
    @Override
    public void locomoção() {
        System.out.println("Nadando");
    }

    @Override
    public void status() {
        System.out.println("");
    }
    
}
