package desafioDecomposicaoOo;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLoja {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Produtos cadastrado na Loja
		Produto p1 = new Produto("Camisa", 59.00);
		Produto p2 = new Produto("Calça", 200);
		Produto p3 = new Produto("Bermuda", 80.99);
		Produto p4 = new Produto("Oculos", 50.00);
		Produto p5 = new Produto("Pijama", 60.00);
		Produto p6 = new Produto("Regata", 30.00);
		Produto p7 = new Produto("Cinto", 10.00);
		Produto p8 = new Produto("Sapato", 60.0);
		Produto p9 = new Produto("Tênis", 120.00);
		Produto p10 = new Produto("Moleton", 80.00);
		
		Cliente cliente1 = new Cliente();
		System.out.println("Digite o CPF do cliente: ");
		cliente1.cpf = scan.nextLine();
		
		//escolhendo os produtos e montando os itens
		int cod = -1;
		
		ArrayList<Item> listaItem1 = new ArrayList<Item>();
		Compra c1 = new Compra();
		
	while(cod != 0) {
		int cod2 = -1;
		listaItem1 = new ArrayList<Item>();
		while (cod2 != 0) {

			System.out.println("PRODUTO | PREÇO  |  Código");
			System.out.println(p1.nome + "  | R$" + p1.preco + "  | 1");
			System.out.println(p2.nome + "   | R$" + p2.preco + "| 2");
			System.out.println(p3.nome + " | R$" + p3.preco + "| 3");
			System.out.println(p4.nome + "  | R$" + p4.preco + " | 4");
			System.out.println(p5.nome + "  | R$" + p5.preco + " | 5");
			System.out.println(p6.nome + "  | R$" + p6.preco + " | 6");
			System.out.println(p7.nome + "   | R$" + p7.preco + " | 7");
			System.out.println(p8.nome + "  | R$" + p8.preco + " | 8");
			System.out.println(p9.nome + "   | R$" + p9.preco + "| 9");
			System.out.println(p10.nome + " | R$" + p10.preco + " | 10");
			System.out.println("");
			System.out.println("insira o código do produto que deseja adicionar ou 0 para sair");
			cod2 = scan.nextInt();
			scan.nextLine();
			if(cod2 == 0)
				break;
				
			System.out.println("insira a quantidade do produto:");
			int quantidade = scan.nextInt();
			scan.nextLine();
			
			
			switch(cod2) {
			
			case 1:
				listaItem1.add(new Item(quantidade,p1));
				break;
			case 2:
				listaItem1.add(new Item(quantidade,p2));
				break;
			case 3:
				listaItem1.add(new Item(quantidade,p3));
				break;
			case 4:
				listaItem1.add(new Item(quantidade,p4));
				break;
			case 5:
				listaItem1.add(new Item(quantidade,p5));
				break;
			case 6:
				listaItem1.add(new Item(quantidade,p6));
				break;
			case 7:
				listaItem1.add(new Item(quantidade,p7));
				break;
			case 8:
				listaItem1.add(new Item(quantidade,p8));
				break;
			case 9:
				listaItem1.add(new Item(quantidade,p9));
				break;
			case 10:
				listaItem1.add(new Item(quantidade,p10));
				break;
			default:
				if((cod2 > 10) || (cod2 <0))
				System.out.println("codigo invalido");
			}	
			
		}
		//whilecod
		c1.obterValorCompra(listaItem1, cliente1);
		System.out.println("Digite novamente 0 para sair ou qualquer tecla para nova compra");
		cod = scan.nextInt();
		scan.nextLine();
		
	}

		// dados da compra

		// total de compras
		ArrayList<Compra> compras1 = new ArrayList<>();
		compras1.add(c1);

		// Total de compra realizadas pelo cliente
		cliente1.obterTotalCompras(compras1);
		scan.close();
	}

}
