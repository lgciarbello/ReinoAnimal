package reinoanimal;

public class Main {

    public static void main(String[] args) {
        Peixes tilapia = new Peixes("Jorge");
        tilapia.status();
        tilapia.locomoção();
        
        Anfibios sapo = new Anfibios("Lineu");
        sapo.status();
        sapo.locomoção();
        
        Mamiferos ovelha = new Mamiferos("Dolly");
        ovelha.status();
        ovelha.locomoção();
        
    }
    
}
