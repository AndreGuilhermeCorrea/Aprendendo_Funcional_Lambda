package aplicacao6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades6.Produtos6;
import utilitarios6.ServicosProdutos6;

public class Programa6 {
	
	public static void main(String[] args) {
	
	
	//Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos cujo nome começa com "J".
		

	Locale.setDefault(Locale.US);
	
	//lista iniciada
	List<Produtos6> list6 = new ArrayList<>();
	
		//inserção dos produtos na lista
		list6.add(new Produtos6("Jg Chave inglesa", 14860.00));
		list6.add(new Produtos6("Jg Chave philips", 1800.00));
		list6.add(new Produtos6("Jg Chave fenda", 1560.00));
		list6.add(new Produtos6("Jg Chave torque", 2300.00));
		list6.add(new Produtos6("jg Chave allen", 1900.00));
		list6.add(new Produtos6("jg Chave torquesa", 3850.00));
		list6.add(new Produtos6("Jg Alicate pressão", 6700.00));
		
		//instanciado o ServicosProdutos6
		ServicosProdutos6 ps6 = new ServicosProdutos6();
		
		//armazenando na variavel soma6 a lista passada no método somaFiltro6 da classe ServicosProdutos6 
		double soma6 = ps6.somaFiltro6(list6);
		
		//impressão da variável soma6 na tela
		System.out.println("A soma dos produtos iniciados com a letra J é igual a: " + "$" + String.format("%.2f", soma6));
		
		//FUNÇÃO QUE RECEBE FUNÇÃO LAMBDA COMO PARÂMETRO
		
		double soma6_1 = ps6.somaFiltro6Predicado(list6, p6 -> p6.getNome6().charAt(0) == 'J');
		//impressão da variável soma6 na tela
		System.out.println("A soma dos produtos iniciados com a letra J é igual a: " + "$" + String.format("%.2f", soma6_1));
		
		
		
		
		
	}	

}
