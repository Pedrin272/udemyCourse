package arraysAndCollections;

import java.util.HashMap;
import java.util.Scanner;

public class hashishMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer, String> listaAlunos= new HashMap<Integer, String>();
		listaAlunos.put(1, "Pedro");
		listaAlunos.put(2, "John");
		listaAlunos.put(3, "Elisa");
		listaAlunos.put(4, "Anne");
		
		System.out.println(listaAlunos);
		for (int i =1; i< listaAlunos.size()+1; i++) {
			System.out.println(listaAlunos.get(i));
		}
		sc.close();
	}
}
