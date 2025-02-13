package corsoJava.ProgrammazioneOggetti.persona.src;

public class Macchina extends Veicolo{

    @Override
    void accelera() {
        System.out.println("La macchina sta accelerando");
    }

    @Override
    void frena() {
        System.out.println("La macchina sta frenando");
    }

}
