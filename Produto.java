package desafioDecomposicaoOo;

public class Produto {
	String nome;
	double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public void listarProdutos() {
	
		System.out.println(this.nome);
		 
	}
}
