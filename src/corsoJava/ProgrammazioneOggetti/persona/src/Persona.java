package corsoJava.ProgrammazioneOggetti.persona.src;

public class Persona {
    // String nome = "Andrea";
    // String cognome = "Izzo";
    // int eta = 25;
    // String colorePreferito = "Rosso";

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
    static int numeroPersone;
    
    Persona(String nome,String cognome,int eta,String colorePreferito){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
        numeroPersone++;
    }

    public String toString(){
        String stringa = this.nome + " " + this.cognome + " " + this.eta + " " + colorePreferito;
        return stringa;
    }

    void saluta(Persona personaDaSalutare){
        System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + nome);
        System.out.println("So che hai: " + personaDaSalutare.eta + " e il tuo colore preferito è: " + personaDaSalutare.colorePreferito);
    }

    static void mostraNumPers(){
        System.out.println("Numero Persone: " + numeroPersone);
    }
}
