package aplicacao1;

import java.util.Comparator;

import entidades8.Produtos1;

//classe Comparator1 implementando Produtos1
public class Comparator1  implements Comparator<Produtos1> {

	//método comparator que recebe 2 produtos e faz sua comparação implementada
	
		/*
		 * Interface funcional
				É uma interface que possui um único método abstrato. 
				
				Suas implementações serão tratadas como expressões lambda.
				
				MANTENDO PORTANTO UM MAPEAMENTO ENTRE A OO COM INTERFACE E A PROGRAMAÇÃO FUNCIONAL
		 */
	@Override
	public int compare(Produtos1 p1_1, Produtos1 p1_2) {
		//o que é comparar um produto com outro retornando um inteiro
		//mesma funcionalidade do comparTo
		
		//comparação dos dois produtos por nome independente de maiusculas e minusculas
		return p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase());
	}
	

}
