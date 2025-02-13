package corsoJava.ProgrammazioneOggetti.persona.src.Pacchetto1;

import java.util.Scanner;

import corsoJava.ProgrammazioneOggetti.persona.src.Pacchetto2.B;

//              class   package suclass world
// public       si      si      si      si
// protected    si      si      si      no
// default      si      si      no      no     
// private      si      no      no      no


public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci Nome:");
        String inputNome = s.nextLine();
        B prova = new B(inputNome);

        prova.stampaNome();
    }
}
