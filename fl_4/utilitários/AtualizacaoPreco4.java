package utilit�rios;

import java.util.function.Consumer;

import entidades4.Produtos4;

public class AtualizacaoPreco4 implements Consumer<Produtos4> {

	//m�todo accept recebendo o Produtos4 como argumento
	@Override
	public void accept(Produtos4 p4) {
		//a��o acceept ser� atualizar o preco do produto em 10% de aumento
		p4.setPreco4(p4.getPreco4() * 1.10);
		
	}

}
