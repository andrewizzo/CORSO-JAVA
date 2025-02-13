package corsoJava.Interfacce.src.Pacchetto1;

public class App {
    public static void main(String[] args) throws Exception {
        Leone leone = new Leone();
        Gazzella gazzella = new Gazzella();
        Pesce pesce = new Pesce();

        gazzella.scappa();
        leone.caccia();
        pesce.caccia();
        pesce.scappa();
    }
}
