package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductEstoque;

public class ProgramEstoque {

	public static void main(String[] args) {
		
		
		//Leitura dos dados do produto
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		ProductEstoque product = new ProductEstoque();   // ProductEsotue()= tem os atributos vazios ( nome price..)
		System.out.println("Enter product data: ");
		
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product); //utilizado metodo to string
		
		System.out.println(); //pulou linha
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		
		sc.close();
	}
}
