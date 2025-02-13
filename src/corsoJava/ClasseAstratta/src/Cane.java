package corsoJava.ClasseAstratta.src;

public class Cane extends Animale{

    String nome;

    public Cane(String nome) {
            super(nome);
            this.nome = nome;
        }
    
        @Override
    void corre() {
        System.out.println(nome + " sta correndo");
    }

        @Override
        void mangia() {
            System.out.println(nome + " mangia crocchette per cani");
        }

}
