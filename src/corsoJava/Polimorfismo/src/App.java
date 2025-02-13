package corsoJava.Polimorfismo.src;

public class App {
    public static void main(String[] args) throws Exception {
        Studente studente1 = new Studente("Luca", "Rossi");
        Insegnante insegnante1 = new Insegnante("Marco", "Verdi");

        Persona[] classe = {studente1,insegnante1};

        for(Persona persona : classe){
            persona.saluta();
        }
    }
}
