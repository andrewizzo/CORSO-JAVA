package corsoJava.Enums.src.enums;

public enum Giorno {
    LUNEDI("Inizio settimana"),
    MARTEDI("Secondo giorno"),
    MERCOLEDI("Metà settimana"),
    GIOVED("Quasi fine settimana"),
    VENERDI("Ultimo giorno lavorativo"),
    SABATO("Weekend!"),
    DOMENICA("Giorno di riposo");

    private String descrizioneString;

    Giorno(String descrizione){
        this.descrizioneString = descrizione;
    }

    public String getDescrizione() {
        return descrizioneString;
    }
}
