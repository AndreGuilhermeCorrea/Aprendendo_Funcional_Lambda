package entidades4;

import entidades4.Produtos4;

public class Produtos4 {

	
	
	private String nome4;
	private Double preco4;
	
	public Produtos4(String nome4, Double preco4) {
		this.nome4 = nome4;
		this.preco4 = preco4;
	}

	public String getNome4() {
		return nome4;
	}

	public void setNome4(String nome4) {
		this.nome4 = nome4;
	}

	public Double getPreco4() {
		return preco4;
	}

	public void setPreco4(Double preco4) {
		this.preco4 = preco4;
	}
	
	//2ª VERSÃO
	////utilizando método estatico com o objeto como parametro
	public static void estaticAtualizacaoPreco4(Produtos4 p4) {
		p4.setPreco4(p4.getPreco4() * 1.10);
	}
	
	//3ª VERSÃO
	////utilizando método nao estatico com o preco4 do proprio objeto 
	public void noEstaticAtualizacaoPreco4() {
		preco4 = preco4 * 1.10;
	}
	
	
	@Override
	public String toString() {
		return (nome4 + ": " + preco4);
	}



	
}
