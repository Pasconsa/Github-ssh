package entities;

public class Rectangle {

	public double ladoA ;  //  public   ATRIBUTOS
	public double ladoB ;
	
	public double area () {			// area () {return ladoA * ladoB ; 	}  METODO
		return ladoA * ladoB ;
	}
	
	public double perimeter () {
		return 2 * (ladoA + ladoB);
	}
	
	public double diagonal () {
		return Math.sqrt(ladoA * ladoA + ladoB *ladoB);
	}
}
