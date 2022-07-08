package aplicacao8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades8.Produtos8;

public class Programa8 {

	/*
	 * Fazer um programa para ler um conjunto de produtos a partir de um arquivo em
	 * formato .csv (suponha que exista pelo menos um produto). Em seguida mostrar o
	 * preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos
	 * produtos que possuem preço inferior ao preço médio.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o caminho da lista: ");
		String arquivos8 = sc.nextLine();

		try (BufferedReader br8 = new BufferedReader(new FileReader(arquivos8))) {

			List<Produtos8> list8 = new ArrayList<>();

			String line8 = br8.readLine();
			while (line8 != null) {
				String[] campos8 = line8.split(",");
				list8.add(new Produtos8(campos8[0], Double.parseDouble(campos8[1])));
				line8 = br8.readLine();
			}

			// pipeline para encontra a soma dos valores
			// conversão da lista pra stream
			double media8 = list8.stream()
					// geração de novo stream com preço dos produtos
					.map(p8 -> p8.getPreco8())
					// funcao reduce que permite a soma e a divisão da lista (size)
					.reduce(0.0, (x, y) -> x + y) / list8.size();

			System.out.println("Média de preço dos produtos: " + String.format("%.2f", media8));

			// função que compara duas strings independente de maiusculas e minusculas
			Comparator<String> comp8 = (s8_1, s8_2) -> s8_1.toUpperCase().compareTo(s8_2.toUpperCase());

			List<String> nomes8 = list8.stream()
					// pipeline filtro com todos abaixo da média
					.filter(p8 -> p8.getPreco8() < media8)
					// .map para acessar o nome de cada produto que foi filtrado e criar uma nova
					// stream
					.map(p8 -> p8.getNome8())
					// organizar os elementos de forma decrescente(reversed ou o comparator reverso)
					.sorted(comp8.reversed())
					// transformar novamente a stream em lista
					.collect(Collectors.toList());

			// impressão dos nomes na tela
			nomes8.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();

	}

}
