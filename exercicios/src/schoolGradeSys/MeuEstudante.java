package schoolGradeSys;

public class MeuEstudante {
		String name;
		String classe;
		double mediaAluno;
		MeuEstudante(){
			name="Tim";
			classe="";
			mediaAluno=0;
			
		}
		MeuEstudante(String nomeInicial,String classeInicial,double mediaInicial) {
			name=nomeInicial;
			classe=classeInicial;
			mediaAluno=mediaInicial;
		}
		
}
