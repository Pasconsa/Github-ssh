package entities;

public class NotaAluno {

	public String nome  ; //01 string Maiusculo
	public double nota1 ;
	public double nota2 ;
	public double nota3 ;
	
	public double notaFinal() {  
		return (nota1 + nota2 + nota3);  //02 return Metodo
	}
	
	public double missingPoints() {  //03 colocar condição do restante nota
		if (notaFinal() < 60.0) {
			return 60 - notaFinal();
	}
		else {
			return 0.0;
		}
		}
}
