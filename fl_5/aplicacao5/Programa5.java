package aplicacao5;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entidades5.Produtos5;

public class Programa5 {

	public static void main(String[] args) {


				
				Locale.setDefault(Locale.US);

				List<Produtos5> list5 = new ArrayList<>();
				
				//percorrer a lista
				
				list5.add(new Produtos5("Desfibrilador", 48200.00));
				list5.add(new Produtos5("Canula de guedel", 50.00));
				list5.add(new Produtos5("Mascara de Venturi", 650.50));
				list5.add(new Produtos5("Tubo oro-traqueal", 80.90));
				
				//recebe os produtos e retorna os mesmos produtos em caixa alta
				
				//FUNCTION
				//� uma func��o, interface FUNCIONAL  parametrizada com 2 parametros com tipo T(entrada) e R(sa�da) que contem o m�todo apply que recebe o objeto do tipo t e e retorna o objeto do tipo r 				
				
				
				//VERSOES FUNCTION
				
				//1� VERS�O
				//A fun��o "map" (n�o confunda com a estrutura de dados Map)  aplica uma fun��o a todos elementos de uma stream(SEQUENCIA DE DADOS)
				//a fun��o map nao funciona apartir de uma lista e sim de uma stream,
				//portanto d�-se a necessidade de converter a lista em uma stream aplicar o map e depois converter novamene para lista
				
				
				/*
				 *  		List para stream: 			.stream()
							Stream para List: 			.collect(Collectors.toList())
				 */
				//conversao para uma nova lista de strams nomes5
				//.stream() com a fun��o map aplicar� uma fun��o a cada elemento da stream, gerando uma nova stream
				//map recebe como argumento o function, e receber� uma instancia da classe CaixaAlta 
				//.collect para converter novamente a stream para lista
				//List<String> nomes5 = list5.stream().map(new CaixaAlta5()).collect(Collectors.toList());
				
				//impress�o da nomes5 com o forEach usando o m�todo println como referencia
				//nomes5.forEach(System.out::println);
								
			
				//2� VERS�O
				////referencia para m�todo utilizando m�todo estatico	
				//List<String> nomes5 = list5.stream().map(Produtos5::estaticoCaixaAlta5).collect(Collectors.toList());
				
				//impress�o da nomes5 com o forEach usando o m�todo println como referencia
				//nomes5.forEach(System.out::println);
				
				
				//3� VERS�O
				////referencia para m�todo utilizando m�todo n�o estatico	
				//List<String> nomes5 = list5.stream().map(Produtos5::noEstaticoCaixaAlta5).collect(Collectors.toList());
				
				//impress�o da nomes5 com o forEach usando o m�todo println como referencia
				//nomes5.forEach(System.out::println);
				
				//4� VERS�O
				//FUNCTION com express�o lambda declarada
				//Function<Produtos5, String> func = p5 -> p5.getNome5().toUpperCase();
				//List<String> nomes5 = list5.stream().map(func).collect(Collectors.toList());
				//impress�o da nomes5 com o forEach usando o m�todo println como referencia
				//nomes5.forEach(System.out::println);
				
				//5� VERS�O
				//FUNCTION com express�o lambda inline, ou seja diretamente como argumento
				List<String> nomes5 = list5.stream().map(p5 -> p5.getNome5().toUpperCase()).collect(Collectors.toList());
				nomes5.forEach(System.out::println);
				


				
	

			}

		}