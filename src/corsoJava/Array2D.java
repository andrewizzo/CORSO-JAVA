package corsoJava;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] classi = {
				{"Andrea","Salvatore"},
				{"Cane","Dio"}
		};
		
//		for(int i = 0; i < classi.length;i++) {
//			for(int j = 0 ; j < classi[i].length;j++) {				
//				System.out.print(classi[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (String[] classe : classi) {
			for (String studente : classe) {
				System.out.print(studente + " ");
			}
			System.out.println();
		}
	}

}
