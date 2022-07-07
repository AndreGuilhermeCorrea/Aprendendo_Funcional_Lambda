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
				//é uma funcção, interface FUNCIONAL  parametrizada com 2 parametros com tipo T(entrada) e R(saída) que contem o método apply que recebe o objeto do tipo t e e retorna o objeto do tipo r 				
				
				
				//VERSOES FUNCTION
				
				//1ª VERSÃO
				//A função "map" (não confunda com a estrutura de dados Map)  aplica uma função a todos elementos de uma stream(SEQUENCIA DE DADOS)
				//a função map nao funciona apartir de uma lista e sim de uma stream,
				//portanto dá-se a necessidade de converter a lista em uma stream aplicar o map e depois converter novamene para lista
				
				
				/*
				 *  		List para stream: 			.stream()
							Stream para List: 			.collect(Collectors.toList())
				 */
				//conversao para uma nova lista de strams nomes5
				//.stream() com a função map aplicará uma função a cada elemento da stream, gerando uma nova stream
				//map recebe como argumento o function, e receberá uma instancia da classe CaixaAlta 
				//.collect para converter novamente a stream para lista
				//List<String> nomes5 = list5.stream().map(new CaixaAlta5()).collect(Collectors.toList());
				
				//impressão da nomes5 com o forEach usando o método println como referencia
				//nomes5.forEach(System.out::println);
								
			
				//2ª VERSÃO
				////referencia para método utilizando método estatico	
				//List<String> nomes5 = list5.stream().map(Produtos5::estaticoCaixaAlta5).collect(Collectors.toList());
				
				//impressão da nomes5 com o forEach usando o método println como referencia
				//nomes5.forEach(System.out::println);
				
				
				//3ª VERSÃO
				////referencia para método utilizando método não estatico	
				//List<String> nomes5 = list5.stream().map(Produtos5::noEstaticoCaixaAlta5).collect(Collectors.toList());
				
				//impressão da nomes5 com o forEach usando o método println como referencia
				//nomes5.forEach(System.out::println);
				
				//4ª VERSÃO
				//FUNCTION com expressão lambda declarada
				//Function<Produtos5, String> func = p5 -> p5.getNome5().toUpperCase();
				//List<String> nomes5 = list5.stream().map(func).collect(Collectors.toList());
				//impressão da nomes5 com o forEach usando o método println como referencia
				//nomes5.forEach(System.out::println);
				
				//5ª VERSÃO
				//FUNCTION com expressão lambda inline, ou seja diretamente como argumento
				List<String> nomes5 = list5.stream().map(p5 -> p5.getNome5().toUpperCase()).collect(Collectors.toList());
				nomes5.forEach(System.out::println);
				


				
	

			}

		}