package corsoJava;

public class OverLoadedMethoads {
    public static void main(String[] args) {
        int doppioInt = addizione(2,3);
        int tripoInt = addizione(3, 4, 5);

        System.out.println("somma: " + doppioInt );
        System.out.println("somma: " + tripoInt );
    }
    

    public static int addizione(int a,int b){
        int risultato = a + b;
        return risultato;
    }

    public static int addizione(int a,int b, int c){
        int risultato = a + b + c;
        return risultato;
    }


}
