package desafioDecomposicaoOo;

import java.util.ArrayList;

public class Cliente {
	
	String cpf;
	double total_compras;
	
	public Cliente() {
		
	}
	
	public Cliente(String cpf) {
		super();
		this.cpf = cpf;
	}
	
	



	public Cliente(double total_compras) {
		super();
		this.total_compras = total_compras;
	}





	ArrayList<Compra> compras = new ArrayList<>();
	
	
	
	//Este metodo deve retornar o valor de todas as compras do cliente
	
	public double obterTotalCompras(ArrayList<Compra> compras ) {
		
		for(Compra compra: compras) {
			
			total_compras += compra.valor_compra;
			
		}
		System.out.println("");
		System.out.println("Valor total das compras com o cpf "+ cpf+ " :R$ " + total_compras);
		System.out.println("");
		return total_compras;
	}

}
