package aplicacao7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa7 {

	public static void main(String[] args) {
		
		
		//STREAM
		
		//Stream � uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "opera��es agregadas".
		//ou seja � criada de uma fonte de dados
		
		/*
		 * Stream � uma solu��o para processar sequ�ncias de dados de forma: 
				 * 	� Declarativa (itera��o interna: escondida do programador)
				 * 	� Parallel-friendly (imut�vel -> thread safe)
				 * 	� Sem efeitos colaterais
				 * 	� Sob demanda (lazy evaluation)
		 */
	
		
		/*
		 * 	Opera��es intermedi�rias e terminais
		 		* 	� O pipeline � composto por zero ou mais opera��es intermedi�rias e uma terminal.
		 * 	
		 * � Opera��o intermedi�ria:
		 * 			� Produz uma nova streams (encadeamento)
		 * 			� S� executa quando uma opera��o terminal � invocada (lazy evaluation)
		 * 			
				 * 	� filter
				 * 	� map
				 *	� flatmap
				 * 	� peek
				 * 	� distinct
				 * 	� sorted
				 * 	� skip
				 * 	� limit (* short-circuit)
		 * 			
		 * � Opera��o terminal:
		 * 			� Produz um objeto n�o-stream (cole��o ou outro)
		 * 			� Determina o fim do processamento da stream
		 * 
				 * � forEach
				 * � forEachOrdered
				 * � toArray
				 * � reduce
				 * � collect
				 * � min
				 * � max
				 * � count
				 * � anyMatch (* short-circuit)
				 * � allMatch (* short-circuit)
				 * � noneMatch (* short-circuit)
				 * � findFirst (* short-circuit)
				 * � findAny (* short-circuit)
	
		 */
		
		//* short-circuit s�o opera�oes que param a execu��o assim que encontrarem o termo que satisfaz sua condi�oes
		
		// cria�ao uma lista ja com os valores nessa
		List<Integer> list7 = Arrays.asList(3, 4, 5, 10, 7);

		// cria��o de uma stream de inteiros apartir da lista
		Stream<Integer> st1 = list7.stream();

		// impress�o com toArray opera��o terminal essa converte a stream para um vetor
		System.out.println(Arrays.toString(st1.toArray()));

		// cria��o de uma stream de inteiros apartir da lista e a fun��o map aplicando
		// uma fun��o a cada elemento da stream (nesse caso elemento x 10) e gerando uma
		// nova stream como resultado
		Stream<Integer> st1_1 = list7.stream().map(x -> x * 10);

		// impress�o com toArray opera��o terminal essa converte a stream para um vetor
		System.out.println(Arrays.toString(st1_1.toArray()));

		// cria��o de uma stream de strings apartir da elementos
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");

		// impress�o com toArray opera��o terminal essa converte a stream para um vetor
		System.out.println(Arrays.toString(st2.toArray()));

		// cria��o de uma stream de inteiros apartir da funcao de gera��o intera��o dos
		// proximos elementos apartir do 1� (0)
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);

		// impress�o com toArray opera��o terminal essa converte a stream para um vetor
		// com um limite de 10 elementos
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		// cria��o de uma stream de inteiros apartir da funcao de fibonacci

		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);

		// impress�o com toArray opera��o terminal essa converte a stream para um vetor
		// com um limite de 10 elementos
		System.out.println(Arrays.toString(st4.limit(20).toArray()));

		// PIPELINE

		// cria�ao uma lista ja com os valores nessa
		List<Integer> list7Pipeline = Arrays.asList(30, 41, 50, 101, 710, 860, 950);

		// cria��o de uma stream de inteiros apartir da lista aplicando a fun��o map
		// (************INTERMEDI�RIA*************)
		Stream<Integer> stPipe1 = list7Pipeline.stream().map(x -> x * 45);

		// impress�o com toArray opera��o (************TERMINAL*************) essa
		// converte a stream para um vetor com um limite de 10 elementos
		System.out.println(Arrays.toString(stPipe1.toArray()));

		// somar os elementos da stream com a opera��o
		// **************TERMINAL*************** reduce (ELEMENTO INICIAL POSTERIORMENTE
		// UMA FUN��O QUE RECEBE 02 ARGUMENTOS E GERA UM RESULTADO (SOMA)
		int soma7 = list7Pipeline.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma: " + soma7);

		// somar os elementos da stream com a opera��o
		// **************TERMINAL*************** reduce (ELEMENTO INICIAL POSTERIORMENTE
		// UMA FUN��O QUE RECEBE 02 ARGUMENTOS E GERA UM RESULTADO (multiplica��o)
		int produto7 = list7Pipeline.stream().reduce(1, (x, y) -> x * y);
		System.out.println("Multiplica��o: " + produto7);
		
		// cria�ao uma outra lista ja com a cria��o dos elementos apartir do predicado
		List<Integer> list7_1Pipeline = list7Pipeline.stream()
				//filtro de todos os elementos pares
				.filter(x -> x % 2 == 0)
				//apartir desse resultado o map vai gerer uma nova stream multiplicado por 10
				.map(x -> x * 10)
				//opera��o terminal para transforma-la em uma lista
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(list7_1Pipeline.toArray()));

		

	}

}
