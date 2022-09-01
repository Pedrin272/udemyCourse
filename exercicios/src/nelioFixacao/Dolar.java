package nelioFixacao;

public class Dolar {
	public static final double IOF=0.06;
	
	public static double calcQntd(double quantity, double valor) {
		double total;
		total= quantity * valor;
		return total*IOF+total;
	}
}
