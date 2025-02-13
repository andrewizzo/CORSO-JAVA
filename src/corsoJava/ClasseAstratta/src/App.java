package corsoJava.ClasseAstratta.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Cane cane = new Cane("Marek");
        cane.corre();
        cane.dorme();
        cane.mangia();
    }
}
