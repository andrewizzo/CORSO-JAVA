package corsoJava;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> numeri = new ArrayList<Integer>();
//		
//		numeri.add(1);
//		numeri.add(2);
//		numeri.add(3);
//		numeri.add(4);
//		numeri.add(5);
//		numeri.add(6);
//		
//		System.out.println(numeri);
		
		ArrayList<ArrayList<String>> classi = new ArrayList();
		
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("Andrea");
		classe1.add("Salvatore");
		
		ArrayList<String> classe2 = new ArrayList<String>();
		classe2.add("Fabio");
		classe2.add("Luca");
		
		classi.add(classe1);
		classi.add(classe2);
		
		for(int i = 0;i < classi.size();i++) {
			System.out.println();
			for(int j = 0;j < classi.get(i).size();j++) {
				System.out.print(classi.get(i).get(j) + " ");
			}
		}
	}

}
