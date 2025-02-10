package corsoJava.ProgrammazioneOggetti.persona.src;

public class Insegnante extends Persona{

    String materiaDaInsegnare = "Storia";

    Insegnante(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        
    }

    void insegna(){
        System.out.println("Sto insegnando...");
    }

    @Override
    void saluta(){
        System.out.println("Ciao Ragazzi!");
    }

    void salutaStudenti(){
        System.out.println("Ciao studenti!");
    }

}
