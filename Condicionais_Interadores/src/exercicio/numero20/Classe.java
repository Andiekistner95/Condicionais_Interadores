/*
 * Pe�a para o usu�rio digitar seu nome e sobrenome. Altere todas as letras para
   ma�usculas, imprima o resultado, e depois altere para min�sculas e altere o
   resultado. (texto = texto.toUpperCase();, texto = texto.toLowerCase();)
 */
package exercicio.numero20;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digitar um texto");
		String texto = scanner.nextLine();
		scanner.close();

		System.out.println(texto = texto.toUpperCase());
		System.out.println(texto = texto.toLowerCase());

	}
}