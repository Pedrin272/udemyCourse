package myClasses;

public class DataTest {
	
	public static void main(String[] args) {
		Data d1=new Data();
		d1.dia=1;
		d1.mes=9;
		d1.ano=1969;
		
		var d2=new Data();
		d2.dia=11;
		d2.mes=8;
		d2.ano=2004;
		
		Data d3=new Data(1,11,1990);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());

	}
	
}
