package aplicacao2;

import java.util.Arrays;

/*
 * 	PARADIGMAS DA PROGRAMA��O
 
		� Imperativo
		 	(C, Pascal, Fortran, Cobol)
		� Orientado a objetos 
			(C++, Object Pascal, Java (< 8), C# (< 3))
		� Funcional
		 	(Haskell, Closure, Clean, Erlang)
		� L�gico 
			(Prolog)
		� Multiparadigma 
			(JavaScript, Java (8+), C# (3+), Ruby, Python, Go) 
 * 
 */

		/*
		 * O que s�o "express�es lambda"?
Em programa��o funcional, express�o lambda corresponde a uma
fun��o an�nima de primeira classe 
		 */

public class Programa2 {

	//ATRIBUTO EST�TICO valendo 3
	public static int globalValue = 3;

	public static void main(String[] args) {
		
		//vetor com valores 3 4 e 5
		int[] vect = new int[] { 3, 4, 5 };
		//fun��o para mudar os valores impares e o vetor como argumento,
		//entretanto o compartamento da fun�ao nao sera o mesmo se for alterado o valor de globalValue (valor externo)
		alterarValoresImpares(vect);
		//imprimir na tela o vetor
		System.out.println(Arrays.toString(vect));
	}

	//fun��o para mudar os valores impares (SEM TRANSPARENCIA REFERENCIAL)
	public static void alterarValoresImpares(int[] numbers) {
		// percorre o vetor
		for (int i = 0; i < numbers.length; i++) {
			//teste se o vetor na posicao i mod 2 for diferente de zero (se o numero � impar)
			if (numbers[i] % 2 != 0) {
				//ser� acrescido nesse elemento o global Value (se for impar sera acrescido 3 (em todos os elementos impares))
				numbers[i] += globalValue;
			}
		}
	}
}
