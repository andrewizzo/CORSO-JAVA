package corsoJava.ProgrammazioneOggetti.persona.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Persona[] persone = new Persona[2];
        Scanner s = new Scanner(System.in);
        
        System.out.println("inserisci Nome: ");
        String inputNome = s.nextLine();

        System.out.println("inserisci Nome: ");
        String inputCognome = s.nextLine();
        String nomeIntero = inputNome + inputCognome;

        Macchina m = new Macchina();
        
        Persona p1 = new Persona("Andrea","Izzo");
        Persona p2 = new Persona(inputNome, inputCognome);
        Persona p3 = new Persona(p2);

        p1.copyPersona(p2);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.toString(nomeIntero));
        // System.out.println(p2.toString(nomeIntero));
        // System.out.println(p3.toString(nomeIntero));

        Studente s1 = new Studente("Luigi", "Imparato","Matematica","5a");

        Insegnante i1 = new Insegnante("Patrik", "Rossi","Storia");
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

        // s1.saluta();
        // i1.saluta();
        // m.accelera();

    

        // p1.saluta(p2);

        // System.out.println(p1);
        // persone[0] = p1;
        // persone[1] = p2;



        // System.out.println(pizza);
        // String setNome = p1.setNome("Gianfranco");
        // String setCognome = p1.setCognome("Rossi");
        // String res = setNome + setCognome;
        // System.out.println(p1.toString(res));

        
        // p.saluta();
        // p.cammina();
        // p.addizione();
    }
}
