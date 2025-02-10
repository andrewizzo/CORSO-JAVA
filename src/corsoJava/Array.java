package corsoJava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeri = {10,20,30,40};
		String[] nomi = {"Salvatore","Andrea","Valentino"};
		
//		for(int i = 0; i < numeri.length;i++) {
//			System.out.println(numeri[i]);
//		}
		
		for(int numero:numeri) {
			System.out.println(numero);
		}
		
		for(int i = 0; i < nomi.length;i++) {
			System.out.println(nomi[i]);
		}
		
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		
	}

}
