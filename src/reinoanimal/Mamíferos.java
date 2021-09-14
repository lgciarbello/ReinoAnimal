package reinoanimal;

public class Mamíferos extends Cordados{

    public Mamíferos(String nome, String respiracao, boolean pecilotermico, String epiderme, String habitat) {
        super(nome, "pulmonar", false, "pelos", "terrestre");
    }

    @Override
    public void locomoção() {
        System.out.println("Andam");
    }

    @Override
    public void status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
