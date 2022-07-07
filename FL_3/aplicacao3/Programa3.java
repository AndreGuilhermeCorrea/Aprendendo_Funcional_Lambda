package aplicacao3;

import java.util.ArrayList;
import java.util.List;

import entidades3.Produtos3;
import utilitario3.Produtos3Predicado;

public class Programa3 {

	public static void main(String[] args) {

		List<Produtos3> list3 = new ArrayList<>();
		
		list3.add(new Produtos3("Chupeta", 900.00));
		list3.add(new Produtos3("Mamadeira", 50.00));
		list3.add(new Produtos3("Absorvente", 350.50));
		list3.add(new Produtos3("Lenço Umedecido", 80.90));
		
		
		//removendo item da lista com expressão lambda e predicado		
		//list3.removeIf(p -> p.getPreco3() >= 150);
		
		//removendo item da lista com expressão lambda e predicado implementado na classe Produtos3Predicado
		list3.removeIf(new Produtos3Predicado());
		
		
		
		for (Produtos3 p : list3) {
			System.out.println(p);
		}
		

	}

}
