package aplicacao2;

import java.util.Arrays;

/*
 * 	PARADIGMAS DA PROGRAMAÇÃO
 
		• Imperativo
		 	(C, Pascal, Fortran, Cobol)
		• Orientado a objetos 
			(C++, Object Pascal, Java (< 8), C# (< 3))
		• Funcional
		 	(Haskell, Closure, Clean, Erlang)
		• Lógico 
			(Prolog)
		• Multiparadigma 
			(JavaScript, Java (8+), C# (3+), Ruby, Python, Go) 
 * 
 */

		/*
		 * O que são "expressões lambda"?
Em programação funcional, expressão lambda corresponde a uma
função anônima de primeira classe 
		 */

public class Programa2 {

	//ATRIBUTO ESTÁTICO valendo 3
	public static int globalValue = 3;

	public static void main(String[] args) {
		
		//vetor com valores 3 4 e 5
		int[] vect = new int[] { 3, 4, 5 };
		//função para mudar os valores impares e o vetor como argumento,
		//entretanto o compartamento da funçao nao sera o mesmo se for alterado o valor de globalValue (valor externo)
		alterarValoresImpares(vect);
		//imprimir na tela o vetor
		System.out.println(Arrays.toString(vect));
	}

	//função para mudar os valores impares (SEM TRANSPARENCIA REFERENCIAL)
	public static void alterarValoresImpares(int[] numbers) {
		// percorre o vetor
		for (int i = 0; i < numbers.length; i++) {
			//teste se o vetor na posicao i mod 2 for diferente de zero (se o numero é impar)
			if (numbers[i] % 2 != 0) {
				//será acrescido nesse elemento o global Value (se for impar sera acrescido 3 (em todos os elementos impares))
				numbers[i] += globalValue;
			}
		}
	}
}
