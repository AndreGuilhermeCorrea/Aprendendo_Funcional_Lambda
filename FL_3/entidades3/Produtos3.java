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

	//referencia para m�todo utilizando m�todo estatico
	//m�todo que pega um produto e retorna um boolean
	//predicado de produto est�tico, recebendo um produto como argumento fazendo a mesma l�gica da interface sendo apenas o m�todo com a l�gica da interface implementada
	//ou seja n�o ser� uma classe separada que implementa uma interface 
	public static boolean estaticoProdutos3Predicado(Produtos3 p3) {
		return p3.getPreco3() >= 100.00;
	}
	
	//referencia para m�todo utilizando m�todo N�O estatico "DA INSTANCIA"
	//m�todo que trabalha com o prorpio produto onde se encontra
	//m�todo N�O estatico s/ argumento fazendo a mesma l�gica da interface MAS ACESSANDO O ATRIBUTO DO OBJETO ONDE SE ENCONTRA
	//ou seja n�o ser� uma classe separada que implementa uma interface 
	public boolean noEstaticoProdutos3Predicado() {
		return preco3 >= 100.00;
	}
	
	@Override
	public String toString() {
		return (nome3 + ": " + preco3);
	}



	
}



