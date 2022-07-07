package utilitários5;

import java.util.function.Function;

import entidades5.Produtos5;

public class CaixaAlta5 implements Function<Produtos5, String> {
	//método apply recebe o produtos5 e retorna uma string
	@Override
	public String apply(Produtos5 p5) {
		return p5.getNome5().toUpperCase();
	}

}
