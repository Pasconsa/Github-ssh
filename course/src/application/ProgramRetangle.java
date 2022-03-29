package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //01 Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //02 Scanner começa letra Maiuscula
		
		Rectangle rect = new Rectangle (); //04 Instancia classe rectnagle nome objeto rect que recebe new rectangle
		
		System.out.println("Enter rectangle ladoA e ladoB: ");
		rect.ladoA = sc.nextDouble();  //05 receber os dados lado A
		rect.ladoB = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area()); //06 Imprimir msg area com 2 casas decimais e colocar a referencia do metodo
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close(); //03 sc.close();
	}

}
