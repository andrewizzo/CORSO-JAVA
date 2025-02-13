package corsoJava.ProgrammazioneOggetti.persona.src.Pacchetto2;

import corsoJava.ProgrammazioneOggetti.persona.src.Pacchetto1.*;

public class B extends A{
    public String nome;

    public B(String nome){
        this.nome = nome;
    }

    public void stampaNome(){
        System.out.println("Il nome è: " + nome);
    }
}
