package Entidade;

public class Produto {
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;		
	}
	
	public double totalEstoque() {
		return valor * quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;		
	}
	
	public void subProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
    public String toString() {
    	return nome
    		   +  ", $ :"
    		   +  valor
    		   + ","
    		   + quantidade
    		   + ", QTD, Total : "
    		   +  totalEstoque();  
    }
}
