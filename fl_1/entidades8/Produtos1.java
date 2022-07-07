package entidades8;

import entidades8.Produtos1;

public class Produtos1 implements Comparable<Produtos1>{
	
	
	private String nome1;
	private Double preco1;
	
	public Produtos1(String nome1, Double preco1) {
		this.nome1 = nome1;
		this.preco1 = preco1;
	}

	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public Double getPreco8() {
		return preco1;
	}

	public void setPreco8(Double preco1) {
		this.preco1 = preco1;
	}

	@Override
	public String toString() {
		return "Produtos1 [nome1=" + nome1 + ", preco1=" + preco1 + "]";
	}
	// 	� Entretanto, desta forma nossa classe n�o fica fechada para altera��o: se o crit�rio de compara��o mudar, precisaremos	alterar a classe Produtos1
	//entao em termos de manuten��o � indesejavel.
	//o ideal � que se tenha criterios de compara��o que 
	//l�gica de compara��o por nome do produto com outro produto, todos convertidos para ma�usculos ignorando portanto maisculas e minusculas.
	
	@Override
	public int compareTo(Produtos1 p1) {
		return nome1.toUpperCase().compareTo(p1.getNome1().toUpperCase());
	}


	
}



