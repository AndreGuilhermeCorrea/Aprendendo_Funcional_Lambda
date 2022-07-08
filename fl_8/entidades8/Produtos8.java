package entidades8;

public class Produtos8 {
	
	private String nome8;
	private Double preco8;
	
	
	public Produtos8(String nome8, Double preco8) {
		super();
		this.nome8 = nome8;
		this.preco8 = preco8;
	}


	public String getNome8() {
		return nome8;
	}


	public void setNome8(String nome8) {
		this.nome8 = nome8;
	}


	public Double getPreco8() {
		return preco8;
	}


	public void setPreco8(Double preco8) {
		this.preco8 = preco8;
	}


	@Override
	public String toString() {
		return "Materiais [Produto: " + nome8 + ", Preço: " + preco8 + "]";
	}
	
	

}
