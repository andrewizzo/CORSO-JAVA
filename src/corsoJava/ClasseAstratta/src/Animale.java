package corsoJava.ClasseAstratta.src;

abstract class Animale {
    String nome;
    public Animale(String nome){
        this.nome = nome;
    }

    abstract void corre();

    abstract void mangia();

    public void dorme(){
        System.out.println(nome + " sta dormendo!");
    }
}
