package desafioDecomposicaoOo;

import java.util.ArrayList;

public class Compra {

	double valor_compra;

	ArrayList<Item> listaItem = new ArrayList<Item>();

	// este metodo deve retornar o valor da compra ou seja soma dos precos da lista
	// de itens
	public double obterValorCompra(ArrayList<Item> listaItem, Cliente cliente) {
		System.out.println("NOVA COMPRA: ");
		System.out.println("CPF: " + cliente.cpf);
		System.out.println("");
		double valor_parcial =0;
		for (Item item : listaItem) {
			System.out.println("Poduto: " + item.p.nome);
			System.out.println("quantidade: " + item.quantidade_produto);
			System.out.println("Valor unitario: " + item.p.preco);
			valor_compra += item.p.preco * item.quantidade_produto;
			valor_parcial += item.p.preco * item.quantidade_produto;
		}
		System.out.println("Total da compra:R$ " + valor_parcial);
		System.out.println("");
		
		return valor_compra;
	}

}
