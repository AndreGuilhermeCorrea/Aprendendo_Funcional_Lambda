package utilitario3;

import java.util.function.Predicate;

import entidades3.Produtos3;

//INTERFACE FUNCIONAL COM APENAS UM MÉTODO ABSTRATO PARA SER IMPLEMENTADO

public class Produtos3Predicado implements Predicate<Produtos3> {
	
	//implemento do contrato da interface com método test
	@Override
	public boolean test(Produtos3 p) {
		//funcao que retorna um booleano retornando verdadeiro se a função for verdadeira
		return p.getPreco3() >= 150;
	}

}
