package entidades3;

public class Produtos3 {
	
	
	private String nome3;
	private Double preco3;
	
	public Produtos3(String nome3, Double preco3) {
		this.nome3 = nome3;
		this.preco3 = preco3;
	}

	public String getNome3() {
		return nome3;
	}

	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}

	public Double getPreco3() {
		return preco3;
	}

	public void setPreco3(Double preco3) {
		this.preco3 = preco3;
	}

	@Override
	public String toString() {
		return "Produtos3 [nome3=" + nome3 + ", preco3=" + preco3 + "]";
	}



	
}



