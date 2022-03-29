package application;

import java.util.Locale;
import java.util.Scanner;
import entities.NotaAluno;

public class ProgramAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //01 lembrar locale
		Scanner sc = new Scanner (System.in);
		
		NotaAluno na = new NotaAluno (); //02 lembrar construir
		
		na.nome = sc.nextLine ();    //03 lembrar classe recebe o metodo
		na.nota1 = sc. nextDouble ();
		na.nota2 = sc.nextDouble ();
		na.nota3 = sc.nextDouble ();
		
		System.out.printf("Nota final: %.2f%n", na.notaFinal()); //04 preenchimento impressão
		
		if (na.notaFinal() <60) {                     //05 imprimir o resultado
			System.out.println("REPROVADO");
			System.out.printf("Faltou %.2f%n pontos", na.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();
	}
}
