package nelioFixacao.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list=new ArrayList<>();
		System.out.println("Quantas pessoas deseja cadastrar?");
		int quantidade= sc.nextInt();
		for(int i=0; i<quantidade;i++) {
			int j =0;
			String nome= sc.next();
			Integer id= sc.nextInt();
			Double salary= sc.nextDouble();
			
			Employee p[i]=(Employee) new Employee(nome, id, salary);
		}
		
		sc.close();
	}

}
