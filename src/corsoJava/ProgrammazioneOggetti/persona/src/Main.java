package corsoJava.ProgrammazioneOggetti.persona.src;

public class Main {
    public static void main(String[] args) throws Exception {
        // Persona[] persone = new Persona[2];

        Persona p1 = new Persona("Andrea","Izzo",25,"Rosso");
        Persona p2 = new Persona("Valentino","Izzo",30,"Blue");

        Pizza pizza = new Pizza("integrale", "sugo", "mozzarella", "basilico");

        Persona[] persone = {p1,p2}; 

        System.out.println(persone[1]);
        // persone[0] = p1;
        // persone[1] = p2;



        // System.out.println(pizza);

        
        // p.saluta();
        // p.cammina();
        // p.addizione();
    }
}
