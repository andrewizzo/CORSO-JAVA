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

    private String nome;
    private String cognome;
    // int eta;
    // String colorePreferito;
    static int numeroPersone;
    
    Persona(String nome,String cognome){
        this.nome = nome;
        this.cognome = cognome;
        // this.eta = eta;
        // this.colorePreferito = colorePreferito;
        numeroPersone++;
    }

    Persona(Persona persona){
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }

    public String toString(String nomeIntero){
        // String stringa = this.nome + " " + this.cognome + " " + this.eta + " " + colorePreferito;
        nomeIntero = this.getNome() + " " + this.getCognome();
        return nomeIntero;
    }

    // void saluta(Persona personaDaSalutare){
    //     System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + nome);
    //     // System.out.println("So che hai: " + personaDaSalutare.eta + " e il tuo colore preferito è: " + personaDaSalutare.colorePreferito);
    //     // System.out.println("So che hai: " + personaDaSalutare.eta);
    // }

    static void mostraNumPers(){
        System.out.println("Numero Persone: " + numeroPersone);
    }

    void saluta(){
        System.out.println("Ciao!");
    }

    public String setNome(String nome){
        this.nome = nome;
        return nome;
    }

    public String setCognome(String cognome){
        this.cognome = cognome;
        return cognome;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void copyPersona(Persona persona){
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }
}
