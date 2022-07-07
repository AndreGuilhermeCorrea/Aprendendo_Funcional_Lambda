package aplicacao1;

import java.util.ArrayList;
import java.util.List;

import entidades8.Produtos1;

public class Programa1 {

	//COMPARATOR

	/*
	 * Suponha uma classe Product com os atributos name e price.
	 * 	� Podemos implementar a compara��o de produtos por meio da implementa��o da interface Comparable<Product>
	 * 	� Entretanto, desta forma nossa classe n�o fica fechada para altera��o: se o crit�rio de compara��o mudar, 
	 * precisaremos	alterar a classe Produtos1.
	 * � Podemos ent�o usar o default method "sort" da interface List:
	 * default void sort(Comparator<? super E> c)
	 */
	
	
	
		/*
		� Comparator objeto de classe separada
		� Comparator objeto de classe an�nima
		� Comparator objeto de express�o lambda com chaves
		� Comparator objeto de express�o lambda sem chaves
		� Comparator express�o lambda "direto no argumento"
		 */
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("COMPARATOR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		//programa que instancia lista de produtos
		List<Produtos1> list = new ArrayList<>();

					//adicionar produtos na lista
					list.add(new Produtos1("Caneta", 900.0));
					list.add(new Produtos1("Borracha", 900.0));
					list.add(new Produtos1("Calculadora", 900.0));
					
					//ordenar a lista Collections.sort entretanto h� a necessidade que a implementacao da lista seja uma implementacao de comparable
					//Collections.sort(list);
					
					
					//arrow function
					//comp vai ser uma fun��o que recebe 02 argumentos p1_1 e p1_2. a implementa��o da fun��o vai ser o que estiver entre chaves
					/*
					 * Comparator<Produtos1> comp = (p1_1, p1_2) -> {
					 * 	//compara��o dos dois produtos por nome independente de maiusculas e minusculas
						return p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase());
					};
					 * 
					
					 *
					 */
					//comparator definido em uma unica linha com vari�vel comp
					/*
					 * Comparator<Produtos1> comp = (p1_1, p1_2) -> p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase());
					 * list.sort(comp);
					 */
					
					//EXPRESS�O LAMBDA
					//Express�o lambda = fun��o an�nima de primeira classe
					//comparator definido em uma unica linha declarado como argumento do sort ou seja uma express�o lambda (FUN��O ANONIMA)
					//CONCISO E DEFINIDO
					list.sort((p1_1, p1_2) -> p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase()));

					
					for (Produtos1 p1 : list) {
						System.out.println(p1);
					

					
					
				}
		}
		

}
