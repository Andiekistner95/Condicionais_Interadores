/*
 * Peça para o usuário digitar um texto e altere todas as vogais do texto, para a letra w,
utilizando o replace. (texto = texto.replace("antigoCaracter", "novoCaracter");)
 */
package exercicio.numero19;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[] vogais = "aeiouAEIOU".toCharArray();

		System.out.println("Favor digitar um texto");
		String texto = scanner.nextLine();
		scanner.close();

		for (int aux = 0; aux < vogais.length; aux++) {
			texto = texto.replace(vogais[aux], 'w');
		
		}
		System.out.println(texto);
	}
}
