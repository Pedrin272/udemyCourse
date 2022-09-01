package nelioFixacao;

import java.util.Scanner;

public class CurrencyConverter {
	
	public static void main(String[] args) {
		double quantity;
		double valor;
		Scanner sc =new Scanner(System.in);
		System.out.println("Qual o valor do dolar?");
		quantity=sc.nextDouble();
		System.out.println("Qual a quantidade a ser comprada?");
		valor=sc.nextDouble();

		
		System.out.println(Dolar.calcQntd(quantity,valor));
		
		
		sc.close();
	}
	
}
