/*
 * Pe�a para o usu�rio digitar o nome completo. Busque em qual posi��o est� o �ltimo
   espa�o � � (texto.lastIndexOf(� �);). Guarde este valor, e agora some mais 1 neste
   valor utilizando ++. Agora utilizando o substring, coloque o valor do resultado da
   soma e imprima o texto (texto = texto.substring(0);). Veja o que acontece.
 */
package exercicio.numero22;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digitar seu nome completo");
		String nome = scanner.nextLine();
		scanner.close();

		int posicao = nome.lastIndexOf(" ");
		posicao++;
		nome = nome.substring(posicao);

		System.out.println(nome);

	}
}
