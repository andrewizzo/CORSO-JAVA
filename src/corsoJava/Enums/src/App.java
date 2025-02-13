package corsoJava.Enums.src;

import corsoJava.Enums.src.enums.Giorno;
import corsoJava.Enums.src.enums.Stato;

public class App {
    public static void main(String[] args) throws Exception {
        
        Giorno giorno = Giorno.LUNEDI;

        Stato stato = Stato.ATTIVO;

        System.out.println("Oggi è : " + giorno + " - " + giorno.getDescrizione());
        System.out.println("Stato : " + stato);
    }
}
