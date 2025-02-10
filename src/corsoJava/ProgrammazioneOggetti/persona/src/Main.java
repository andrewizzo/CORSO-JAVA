package corsoJava.ProgrammazioneOggetti.persona.src;

public class Main {
    public static void main(String[] args) throws Exception {
        // Persona[] persone = new Persona[2];

        Persona p1 = new Persona("Andrea","Izzo",25,"Rosso");
        Persona p2 = new Persona("Valentino","Izzo",30,"Blue");
        Persona p3 = new Persona("Mario","Rossi",31,"Giallo");
        Persona p4 = new Persona("Mario","Rossi",31,"Giallo");
        Persona p5 = new Persona("Mario","Rossi",31,"Giallo");
        Persona p6 = new Persona("Mario","Rossi",31,"Giallo");
        Persona p7 = new Persona("Mario","Rossi",31,"Giallo");

        // Pizza pizza = new Pizza("integrale", "sugo", "mozzarella", "basilico");
        Persona.mostraNumPers();

        Persona[] persone = {p1,p2}; 

        // p1.saluta(p2);

        // System.out.println(p1);
        // persone[0] = p1;
        // persone[1] = p2;



        // System.out.println(pizza);

        
        // p.saluta();
        // p.cammina();
        // p.addizione();
    }
}
