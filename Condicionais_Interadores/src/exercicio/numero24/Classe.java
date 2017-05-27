/*
 * Utilizando o exercício 21 como exemplo, tente extrair o mês da data, utilizando as
   funções indexOf e substring.
 */
package exercicio.numero24;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digitar data (dd/mm/aa)");
		String data = scanner.nextLine();
		scanner.close();

		int posicao1 = data.indexOf("/");
		int posicao2 = data.lastIndexOf("/");
		posicao1++;

		data = data.substring(posicao1, posicao2);

		System.out.println(data);

	}
}
