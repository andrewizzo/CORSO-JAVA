package corsoJava.Interfacce.src.Pacchetto1;

import corsoJava.Interfacce.src.Pacchetto1.Interfacce.Preda;
import corsoJava.Interfacce.src.Pacchetto1.Interfacce.Predatore;

public class Pesce implements Preda,Predatore{

    @Override
    public void caccia() {
        System.out.println("Il Pesce sta cacciando!");
    }

    @Override
    public void scappa() {
        System.out.println("Il Pesce sta scappando!");
    }

}
