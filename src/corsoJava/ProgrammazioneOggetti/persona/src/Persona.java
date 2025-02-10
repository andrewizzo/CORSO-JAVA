package corsoJava.ProgrammazioneOggetti.persona.src;

public class Persona {
    // String nome = "Andrea";
    // String cognome = "Izzo";
    // int eta = 25;
    // String colorePreferito = "Rosso";

    // void saluta(){
    //     System.out.println("Ciao sono " + nome);
    // }

    // void cammina(){
    //     System.out.println("Sto camminando...");
    // }

    // void addizione(){
    //     System.out.println(5 + 5);
    // }

    // void pensa(){
    //     System.out.println("Sto pensando...");
    // }

    String nome;
    String cognome;
    int eta;
    String colorePreferito;
    
    Persona(String nome,String cognome,int eta,String colorePreferito){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    public String toString(){
        String stringa = this.nome + " " + this.cognome + " " + this.eta + " " + colorePreferito;
        return stringa;
    }
}
