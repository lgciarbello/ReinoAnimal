package reinoanimal;

public class Anfíbios extends Cordados{

    public Anfíbios(String nome, String respiracao, boolean pecilotermico, String epiderme, String habitat) {
        super(nome, "branquial/pulmonar", true, "", "aquático/terrestre");
    }

    @Override
    public void locomoção() {
        System.out.println("Pulam");
    }

    @Override
    public void status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
