package schoolGradeSys;

import java.util.Scanner;

public class Students {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MeuEstudante d1= new MeuEstudante();
		d1.name= "John";
		d1.classe="1 ano";
		d1.mediaAluno= 3.4;
		System.out.println(d1.name);
		//cadsatro rotativo de alunos
		
		System.out.print("Quantos alunos voc� deseja cadastrar?");
		var alunosCadastro = sc.nextInt();
		String[] dadosCadastrais = new String [alunosCadastro];
		
		for (int i=0; i < dadosCadastrais.length; i++) {
			System.out.print( (i+1) +"Insira o nome de cada aluno: ");
			dadosCadastrais[i]=sc.next();
		}

		sc.close();
	}


}
