package aplicacao1;

import java.util.ArrayList;
import java.util.List;

import entidades8.Produtos1;

public class Programa1 {

	//COMPARATOR

	/*
	 * Suponha uma classe Product com os atributos name e price.
	 * 	• Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
	 * 	• Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar, 
	 * precisaremos	alterar a classe Produtos1.
	 * • Podemos então usar o default method "sort" da interface List:
	 * default void sort(Comparator<? super E> c)
	 */
	
	
	
		/*
		• Comparator objeto de classe separada
		• Comparator objeto de classe anônima
		• Comparator objeto de expressão lambda com chaves
		• Comparator objeto de expressão lambda sem chaves
		• Comparator expressão lambda "direto no argumento"
		 */
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("COMPARATOR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		//programa que instancia lista de produtos
		List<Produtos1> list = new ArrayList<>();

					//adicionar produtos na lista
					list.add(new Produtos1("Caneta", 900.0));
					list.add(new Produtos1("Borracha", 900.0));
					list.add(new Produtos1("Calculadora", 900.0));
					
					//ordenar a lista Collections.sort entretanto há a necessidade que a implementacao da lista seja uma implementacao de comparable
					//Collections.sort(list);
					
					
					//arrow function
					//comp vai ser uma função que recebe 02 argumentos p1_1 e p1_2. a implementação da função vai ser o que estiver entre chaves
					/*
					 * Comparator<Produtos1> comp = (p1_1, p1_2) -> {
					 * 	//comparação dos dois produtos por nome independente de maiusculas e minusculas
						return p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase());
					};
					 * 
					
					 *
					 */
					//comparator definido em uma unica linha com variável comp
					/*
					 * Comparator<Produtos1> comp = (p1_1, p1_2) -> p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase());
					 * list.sort(comp);
					 */
					
					//EXPRESSÃO LAMBDA
					//Expressão lambda = função anônima de primeira classe
					//comparator definido em uma unica linha declarado como argumento do sort ou seja uma expressão lambda (FUNÇÃO ANONIMA)
					//CONCISO E DEFINIDO
					list.sort((p1_1, p1_2) -> p1_1.getNome1().toUpperCase().compareTo(p1_2.getNome1().toUpperCase()));

					
					for (Produtos1 p1 : list) {
						System.out.println(p1);
					

					
					
				}
		}
		

}
