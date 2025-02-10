package corsoJava.ProgrammazioneOggetti.persona.src;

public class Studente extends Persona{

    String materiPreferita = "Matematica";
    String classe = "5a";
    int[] voti = {3,4,5,6,7,8,9};

    Studente(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        
    }

    void studia(){
        System.out.println("Sto studiando...");
    }

    @Override
    void saluta(){
        System.out.println("Ciao Prof!");
    }

}
