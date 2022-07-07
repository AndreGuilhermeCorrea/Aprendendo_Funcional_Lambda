package entidades6;

public class Produtos6 {
	private String nome6;
	private Double preco6;
	
	
	public Produtos6(String nome6, Double preco6) {
		this.nome6 = nome6;
		this.preco6 = preco6;
	}


	public String getNome6() {
		return nome6;
	}


	public void setNome6(String nome6) {
		this.nome6 = nome6;
	}


	public double getPreco6() {
		return preco6;
	}


	public void setPreco6(Double preco6) {
		this.preco6 = preco6;
	}


	@Override
	public String toString() {
		return "Produtos6 [Produtos" + nome6 + ": " + preco6 + "]";
	}
	

}
