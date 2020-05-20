package Aplication;

import java.util.Locale;
import java.util.Scanner;


import Entidade.Produto;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entra com as informações do produto :");
		System.out.print(" Nome : ");
		String nome = sc.nextLine();
		System.out.print(" Valor : ");
		double valor = sc.nextDouble();
		System.out.print(" Quantidade : ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, valor, quantidade);
		
		produto.setName("Computador");
		System.out.println(" Produto Atualizado" + produto.getNome());
		
		produto.setValor(9999);
		System.out.println("  valor atualizado " + produto.getValor());
		
//		System.out.println(produto.nome + "," + produto.valor +"," + produto.quantidade );
		
		System.out.println();
		System.out.println(" Dados do Produto " + produto);
		
		System.out.println();
		System.out.print(" digite a quantidade de produtos para ser adiciando no estoque:  ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.print(" Estoque do produto atualiza  " + produto);
		
		System.out.println();
		System.out.print(" digite a quantidade de produtos para ser removido no estoque:  ");
		int qtd = sc.nextInt();
		produto.subProduto(qtd);
		
		System.out.println();
		System.out.print(" Estoque do produto atualiza subtv  " + produto);
		
		
		sc.close();	
	}
}