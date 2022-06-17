package arraysAndCollections;

import java.util.Scanner;

public class MyArrays {
	
	//calculo de media guardada em uma array
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//quantidade de elementos na array
		System.out.print("Informe Quantos Itens: ");
		Integer quantidadeDeNotas = sc.nextInt();
		
		double[] notas= new double[quantidadeDeNotas];

		//estado inicial i=0, enquanto i menor que quantidade de itens na Array, i+1
		for (int i=0; i < notas.length; i++) {
			System.out.print("Insira um valor para " + (i+1) +": ");
			notas[i]=sc.nextDouble();
		}
		//pegar valor total e tirar a m�dia
		double total = 0;
		for (double nota: notas) {
			total+=nota;
		}
		double media = total/notas.length;
		System.out.println("A m�dia � "+ media+"!!!");
		sc.close();
	}

}
