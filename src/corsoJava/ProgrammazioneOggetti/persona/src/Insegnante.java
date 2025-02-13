package corsoJava.ProgrammazioneOggetti.persona.src;

public class Insegnante extends Persona{

    String materia;

    Insegnante(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
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
