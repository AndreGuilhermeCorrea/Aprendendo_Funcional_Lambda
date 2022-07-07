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
				//� uma interface genercis parametrizada com tipo t que contem apenas um m�todo abstrato chamado accept, um void que executa uma a�ao e nao retorna nada
				
				//VERSOES CONSUMER
				//1� VERS�O
				//listforeach ir� percorrer a lista recebendo uma instancia como objeto ou seja aplicando o consumer
				//o consumer depender� de uma classe que o implementar�
				//essa l�gia atualizar� os pre�os da lista em 10% a mais
				//list4.forEach(new AtualizacaoPreco4());
				//impress�o da lis4 com o consumer usando o m�todo println como referencia
				//list4.forEach(System.out::println);
				
			
				//2� VERS�O
				////referencia para m�todo utilizando m�todo estatico	
				//list4.forEach(Produtos4::estaticAtualizacaoPreco4);
				//impress�o da lis4 com o consumer usando o m�todo println como referencia
				//list4.forEach(System.out::println);
				
				
				//3� VERS�O
				////referencia para m�todo utilizando m�todo n�o estatico	
				//list4.forEach(Produtos4::noEstaticAtualizacaoPreco4);
				//impress�o da lis4 com o consumer usando o m�todo println como referencia
				//list4.forEach(System.out::println);
				
				//4� VERS�O
				//consumer com express�o lambda declarada
				//double juros = 1.1;
				//Consumer<Produtos4> cons = p4 -> p4.setPreco4(p4.getPreco4() * juros);
				//list4.forEach(cons);
				//list4.forEach(System.out::println);
				
				//5� VERS�O
				//consummer com express�o lambda inline, ou seja diretamente como argumento do forEach,
				list4.forEach(p4 -> p4.setPreco4(p4.getPreco4() * 1.1));
				list4.forEach(System.out::println);
				


				
	

			}

		}