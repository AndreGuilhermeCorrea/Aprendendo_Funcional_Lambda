package aplicacao1;

import java.util.Comparator;

import entidades8.Produtos1;

//classe Comparator1 implementando Produtos1
public class Comparator1  implements Comparator<Produtos1> {

	//m�todo comparator que recebe 2 produtos e faz sua compara��o implementada
	
		/*
		 * Interface funcional
				� uma interface que possui um �nico m�todo abstrato. 
				
				Suas implementa��es ser�o tratadas como express�es lambda.
				
				MANTENDO PORTANTO UM MAPEAMENTO ENTRE A OO COM INTERFACE E A PROGRAMA��O FUNCIONAL
		 */
	@Override
	public int compare(Produtos1 p1_1, Produtos1 p1_2) {
		//o que � comparar um produto com outro retornando um inteiro
		//mesma funcionalidade do comparTo
		
		//compara��o dos dois produtos por nome independente de maiusculas e minusculas
		return p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase());
	}
	

}
