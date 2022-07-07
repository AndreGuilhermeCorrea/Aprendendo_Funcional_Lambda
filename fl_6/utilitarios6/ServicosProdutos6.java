package utilitarios6;

import java.util.List;
import java.util.function.Predicate;

import entidades6.Produtos6;

public class ServicosProdutos6 {
	
	public double somaFiltro6Predicado(List<Produtos6> list6, Predicate<Produtos6> predicado6){
		double soma6_1 = 0.0;
		for (Produtos6 p6 : list6) {
			//teste genérico para qualquer predicado que for recebido como parametro
			
			if (predicado6.test(p6)) {
				soma6_1 += p6.getPreco6();
			}
		}
		return soma6_1;
		
		
	}

	public double somaFiltro6(List<Produtos6> list6){
		double soma6 = 0.0;
		for (Produtos6 p6 : list6) {
			//teste por meio de predicate >>>>>>>>>>>>>>p6.getNome6().charAt(0) == 'J'<<<<<<<<<<<<<<<
			if (p6.getNome6().charAt(0) == 'J') {
				soma6 += p6.getPreco6();
			}
		}
		return soma6;
	}

}
