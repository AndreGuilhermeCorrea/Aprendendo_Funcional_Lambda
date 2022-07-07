package aplicacao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades3.Produtos3;

public class Programa3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Produtos3> list3 = new ArrayList<>();
		
		list3.add(new Produtos3("Chupeta", 900.00));
		list3.add(new Produtos3("Mamadeira", 50.00));
		list3.add(new Produtos3("Absorvente", 350.50));
		list3.add(new Produtos3("Lenço Umedecido", 80.90));
		
		
		//Predicate
		//é uma interface genercis parametrizada com tipo t que contem apenas um método abstrato chamado test que resebe um objeto tipo t retornando um boolean
		
		
		//VERSOES PREDICATE
		//1ª VERSÃO
		//removendo item da lista com expressão lambda e predicado		
		//list3.removeIf(p -> p.getPreco3() >= 150);
		
		//2ª VERSÃO
		//removendo item da lista com expressão lambda e predicado implementado na classe Produtos3Predicado
		//list3.removeIf(new Produtos3Predicado());
		
		//3ª VERSÃO
		//referencia para método utilizando método estatico
		//list3.removeIf(Produtos3::estaticoProdutos3Predicado);

		//4ª VERSÃO
		//referencia para método utilizando método NÃO estatico
		//list3.removeIf(Produtos3::noEstaticoProdutos3Predicado);
		
		//5ª VERSÃO
		//expressão lambda declarada
		//sem referencia de método, variável recebendo a expressão lambda (função anonima que recebe como argumento um produto p3 resultando no boolean 
		//double min3 = 150;
		//Predicate<Produtos3> pred = p3 -> p3.getPreco3() >= min3;
		//list3.removeIf(pred);
		
		//6ª VERSÃO
		//expressão lambda inline, ou seja diretamente como argumento do remove if,
		list3.removeIf( p3 -> p3.getPreco3() >= 150);
		
		
		
		for (Produtos3 p3 : list3) {
			System.out.println(p3);
		}
		

	}

}
