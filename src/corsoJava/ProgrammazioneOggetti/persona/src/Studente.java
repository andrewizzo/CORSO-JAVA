package corsoJava.ProgrammazioneOggetti.persona.src;

public class Studente extends Persona{

    String materiPreferita;
    String classe;
    int[] voti = {3,4,5,6,7,8,9};

    Studente(String nome, String cognome, String materiaPreferita, String classe) {
        super(nome, cognome);
        
    }

    void studia(){
        System.out.println("Sto studiando...");
    }

    @Override
    void saluta(){
        System.out.println("Ciao Prof!");
    }

}
