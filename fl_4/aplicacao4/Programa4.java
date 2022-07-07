package aplicacao4;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades4.Produtos4;

public class Programa4 {

	public static void main(String[] args) {


				
				Locale.setDefault(Locale.US);

				List<Produtos4> list4 = new ArrayList<>();
				
				//percorrer a lista
				
				list4.add(new Produtos4("Teclado", 200.00));
				list4.add(new Produtos4("Mouse", 50.00));
				list4.add(new Produtos4("Fones", 650.50));
				list4.add(new Produtos4("Camera 4k", 880.90));
				
				//aumentar a lista em 10%
				
				//CONSUMER
				//é uma interface genercis parametrizada com tipo t que contem apenas um método abstrato chamado accept, um void que executa uma açao e nao retorna nada
				
				//VERSOES CONSUMER
				//1ª VERSÃO
				//listforeach irá percorrer a lista recebendo uma instancia como objeto ou seja aplicando o consumer
				//o consumer dependerá de uma classe que o implementará
				//essa lógia atualizará os preços da lista em 10% a mais
				//list4.forEach(new AtualizacaoPreco4());
				//impressão da lis4 com o consumer usando o método println como referencia
				//list4.forEach(System.out::println);
				
			
				//2ª VERSÃO
				////referencia para método utilizando método estatico	
				//list4.forEach(Produtos4::estaticAtualizacaoPreco4);
				//impressão da lis4 com o consumer usando o método println como referencia
				//list4.forEach(System.out::println);
				
				
				//3ª VERSÃO
				////referencia para método utilizando método não estatico	
				//list4.forEach(Produtos4::noEstaticAtualizacaoPreco4);
				//impressão da lis4 com o consumer usando o método println como referencia
				//list4.forEach(System.out::println);
				
				//4ª VERSÃO
				//consumer com expressão lambda declarada
				//double juros = 1.1;
				//Consumer<Produtos4> cons = p4 -> p4.setPreco4(p4.getPreco4() * juros);
				//list4.forEach(cons);
				//list4.forEach(System.out::println);
				
				//5ª VERSÃO
				//consummer com expressão lambda inline, ou seja diretamente como argumento do forEach,
				list4.forEach(p4 -> p4.setPreco4(p4.getPreco4() * 1.1));
				list4.forEach(System.out::println);
				


				
	

			}

		}