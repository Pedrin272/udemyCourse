package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Insira o salario do mes passado: ");
		String mes1 = Scan.next().replace(",", ".");
		System.out.println("Insira o salario do mes anterior: ");
		String mes2 = Scan.next().replace(",", ".");
		System.out.println("Insira o salario do mes anterior: ");
	    String mes3 = Scan.next().replace(",", ".");
	    
	    Double primeiro = Double.parseDouble(mes1);
	    Double segundo = Double.parseDouble(mes2);
	    Double terceiro = Double.parseDouble(mes3);
	    Double soma = (primeiro + segundo+ terceiro);
	    Double media = soma/3;
	    
	    System.out.println("A soma é: "+soma);
	    System.out.println("A media é: "+media);
	}

}
