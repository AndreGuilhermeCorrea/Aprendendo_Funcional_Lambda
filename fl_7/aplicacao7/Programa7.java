package aplicacao7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa7 {

	public static void main(String[] args) {
		
		
		//STREAM
		
		//Stream É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
		//ou seja é criada de uma fonte de dados
		
		/*
		 * Stream é uma solução para processar sequências de dados de forma: 
				 * 	• Declarativa (iteração interna: escondida do programador)
				 * 	• Parallel-friendly (imutável -> thread safe)
				 * 	• Sem efeitos colaterais
				 * 	• Sob demanda (lazy evaluation)
		 */
	
		
		/*
		 * 	Operações intermediárias e terminais
		 		* 	• O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
		 * 	
		 * • Operação intermediária:
		 * 			• Produz uma nova streams (encadeamento)
		 * 			• Só executa quando uma operação terminal é invocada (lazy evaluation)
		 * 			
				 * 	• filter
				 * 	• map
				 *	• flatmap
				 * 	• peek
				 * 	• distinct
				 * 	• sorted
				 * 	• skip
				 * 	• limit (* short-circuit)
		 * 			
		 * • Operação terminal:
		 * 			• Produz um objeto não-stream (coleção ou outro)
		 * 			• Determina o fim do processamento da stream
		 * 
				 * • forEach
				 * • forEachOrdered
				 * • toArray
				 * • reduce
				 * • collect
				 * • min
				 * • max
				 * • count
				 * • anyMatch (* short-circuit)
				 * • allMatch (* short-circuit)
				 * • noneMatch (* short-circuit)
				 * • findFirst (* short-circuit)
				 * • findAny (* short-circuit)
	
		 */
		
		//* short-circuit são operaçoes que param a execução assim que encontrarem o termo que satisfaz sua condiçoes
		
		// criaçao uma lista ja com os valores nessa
		List<Integer> list7 = Arrays.asList(3, 4, 5, 10, 7);

		// criação de uma stream de inteiros apartir da lista
		Stream<Integer> st1 = list7.stream();

		// impressão com toArray operação terminal essa converte a stream para um vetor
		System.out.println(Arrays.toString(st1.toArray()));

		// criação de uma stream de inteiros apartir da lista e a função map aplicando
		// uma função a cada elemento da stream (nesse caso elemento x 10) e gerando uma
		// nova stream como resultado
		Stream<Integer> st1_1 = list7.stream().map(x -> x * 10);

		// impressão com toArray operação terminal essa converte a stream para um vetor
		System.out.println(Arrays.toString(st1_1.toArray()));

		// criação de uma stream de strings apartir da elementos
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");

		// impressão com toArray operação terminal essa converte a stream para um vetor
		System.out.println(Arrays.toString(st2.toArray()));

		// criação de uma stream de inteiros apartir da funcao de geração interação dos
		// proximos elementos apartir do 1º (0)
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);

		// impressão com toArray operação terminal essa converte a stream para um vetor
		// com um limite de 10 elementos
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		// criação de uma stream de inteiros apartir da funcao de fibonacci

		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);

		// impressão com toArray operação terminal essa converte a stream para um vetor
		// com um limite de 10 elementos
		System.out.println(Arrays.toString(st4.limit(20).toArray()));

		// PIPELINE

		// criaçao uma lista ja com os valores nessa
		List<Integer> list7Pipeline = Arrays.asList(30, 41, 50, 101, 710, 860, 950);

		// criação de uma stream de inteiros apartir da lista aplicando a função map
		// (************INTERMEDIÁRIA*************)
		Stream<Integer> stPipe1 = list7Pipeline.stream().map(x -> x * 45);

		// impressão com toArray operação (************TERMINAL*************) essa
		// converte a stream para um vetor com um limite de 10 elementos
		System.out.println(Arrays.toString(stPipe1.toArray()));

		// somar os elementos da stream com a operação
		// **************TERMINAL*************** reduce (ELEMENTO INICIAL POSTERIORMENTE
		// UMA FUNÇÃO QUE RECEBE 02 ARGUMENTOS E GERA UM RESULTADO (SOMA)
		int soma7 = list7Pipeline.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma: " + soma7);

		// somar os elementos da stream com a operação
		// **************TERMINAL*************** reduce (ELEMENTO INICIAL POSTERIORMENTE
		// UMA FUNÇÃO QUE RECEBE 02 ARGUMENTOS E GERA UM RESULTADO (multiplicação)
		int produto7 = list7Pipeline.stream().reduce(1, (x, y) -> x * y);
		System.out.println("Multiplicação: " + produto7);
		
		// criaçao uma outra lista ja com a criação dos elementos apartir do predicado
		List<Integer> list7_1Pipeline = list7Pipeline.stream()
				//filtro de todos os elementos pares
				.filter(x -> x % 2 == 0)
				//apartir desse resultado o map vai gerer uma nova stream multiplicado por 10
				.map(x -> x * 10)
				//operação terminal para transforma-la em uma lista
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(list7_1Pipeline.toArray()));

		

	}

}
