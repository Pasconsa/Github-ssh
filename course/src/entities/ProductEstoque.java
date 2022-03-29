package entities;

public class ProductEstoque {

	public String name;
	public double price;
	public int quantity;
	
	//operação que devolve o total do estoque , retorna preço pela quantidade
	public double totalValueStock() {     
		return price * quantity;
	}

	//metodo recebeu dentro parenteses pois apenas altera o valor atributo quantity
	public void addProducts(int quantity) {
		this.quantity += quantity;  //atributo quantity soma com parametro quantity
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueStock());
	}
}
