package nelioFixacao.arrays;

import java.util.Scanner;

public class CadastrarPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros vão ser inseridos: ");
		Pessoa[] vect = new Pessoa[sc.nextInt()];
		for(int i=0;i<vect.length;i++) {
			String name;
			int age;
			double height;
			
			System.out.println("Digite o nome: ");
			name = sc.next();
			System.out.println("Digite a idade: ");
			age = sc.nextInt();
			System.out.println("Digite a altura: ");
			height = sc.nextDouble();
			vect[i]=new Pessoa(name, age, height);
		}
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i].toString());
		} 
		
		sc.close();
	}

}
