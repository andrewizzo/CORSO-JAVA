package corsoJava.ProgrammazioneOggetti.persona.src;

public class Main {
    public static void main(String[] args) throws Exception {
        // Persona[] persone = new Persona[2];

        Persona p1 = new Persona("Andrea","Izzo",25);

        Studente s1 = new Studente("Luigi", "Imparato", 26);

        Insegnante i1 = new Insegnante("Patrik", "Rossi", 45);
        // Persona p2 = new Persona("Valentino","Izzo",30,"Blue");
        // Persona p3 = new Persona("Mario","Rossi",31,"Giallo");
        // Persona p4 = new Persona("Mario","Rossi",31,"Giallo");
        // Persona p5 = new Persona("Mario","Rossi",31,"Giallo");
        // Persona p6 = new Persona("Mario","Rossi",31,"Giallo");
        // Persona p7 = new Persona("Mario","Rossi",31,"Giallo");

        // Pizza pizza = new Pizza("integrale", "sugo", "mozzarella", "basilico");
        
        // Persona[] persone = {p1,p2,p3,p4,p5,p6,p7}; 

        // Persona.mostraNumPers();

        // s1.saluta(s1);
        // s1.studia();
        // s1.salutaInsegnante(i1.nome);
        // i1.insegna();
        // i1.salutaStudenti();

        s1.saluta();
        i1.saluta();

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
