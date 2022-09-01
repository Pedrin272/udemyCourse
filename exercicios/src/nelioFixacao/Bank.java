package nelioFixacao;
import nelioFixacao.Account;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double deposit = 0.0;
		System.out.println("Enter the Account number: ");
		int id=sc.nextInt();
		
		System.out.println("Enter the User name: ");
		String userName=sc.next();
		
		System.out.println("Is there an initial deposit? (1:Yes/0:No)");
		int question=sc.nextInt();
		
		if (question==1) {
			System.out.println("Enter an inicial deposit ");
			deposit=sc.nextDouble();
			 account=new Account(id,userName,deposit);
		}else{
			
			 account=new Account(id,userName);
		}
		

		System.out.println(account.toString());
		System.out.println("Do you want to add more? (1:Yes/0:No)");
		question=sc.nextInt();
		if (question==1) {
			System.out.println("Enter an deposit ");
			deposit=sc.nextDouble();
			account.add(deposit);
		}
		System.out.println(account.toString());
		sc.close();
	}

	
}
