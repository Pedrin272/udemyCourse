package nelioFixacao.arrays;

import java.util.Scanner;

public class EstudoArrays {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite quantos numeros vão ser inseridos: ");
		int[] vet= new int[sc.nextInt()];
		
		for(int i=0;i<vet.length;i++) {
			System.out.println("Digite um numero: ");
			vet[i]=sc.nextInt();
		}
		System.out.println("Numeros Negativos: ");
		for(int i=0;i<vet.length;i++) {
			if (vet[i]<0) {
				System.out.println(vet[i]);
			}
		}
		sc.close();
	}

}
