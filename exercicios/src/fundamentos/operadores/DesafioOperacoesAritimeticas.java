package fundamentos.operadores;

public class DesafioOperacoesAritimeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double numA=Math.pow(6*(3+2), 2);
		Double denA= (double) (3*2);
		
		Double numB=(double) ((1-5)*(2-7));
		Double denB=(double) 2;
		
		Double A= numA/denA;
		Double B= Math.pow(numB/denB, 2);
		
		System.out.println(A);
		System.out.println(B);
		
		Double numC=Math.pow(A-B, 3);
		Double denC=Math.pow(10, 3);
		System.out.println(numC/denC);
	}

}
