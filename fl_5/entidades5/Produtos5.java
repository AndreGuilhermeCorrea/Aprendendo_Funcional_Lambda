package entidades5;

public class Produtos5 {

	
	
	private String nome5;
	private Double preco5;
	
	public Produtos5(String nome5, Double preco5) {
		this.nome5 = nome5;
		this.preco5 = preco5;
	}

	public String getNome5() {
		return nome5;
	}

	public void setNome5(String nome5) {
		this.nome5 = nome5;
	}

	public Double getPreco5() {
		return preco5;
	}

	public void setPreco5(Double preco5) {
		this.preco5 = preco5;
	}
	
	//2ª VERSÃO
	////utilizando método estatico com o objeto como Argumento
	public static String estaticoCaixaAlta5(Produtos5 p5) {
		return p5.getNome5().toUpperCase();
	}
	
	//3ª VERSÃO
	////utilizando método nao estatico com o proprio objeto 
	public String noEstaticoCaixaAlta5() {
		return nome5.toUpperCase();
	}

	
	
	@Override
	public String toString() {
		return (nome5 + ": " + preco5);
	}



	
}
