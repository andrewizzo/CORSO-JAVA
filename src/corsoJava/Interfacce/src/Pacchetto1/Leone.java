package corsoJava.Interfacce.src.Pacchetto1;

import corsoJava.Interfacce.src.Pacchetto1.Interfacce.Predatore;

public class Leone implements Predatore{

    @Override
    public void caccia() {
        System.out.println("Il Leone caccia!");
    }

}
