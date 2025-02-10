package corsoJava.ProgrammazioneOggetti.persona.src;

public class Pizza {
    String impasto;
    String salsa;
    String formaggio;
    String extra;

    Pizza(String impasto,String salsa,String formaggio,String extra){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        System.out.println("Pizza da fare:" + impasto + "," + salsa + "," + formaggio + "," + extra);
    }
}
