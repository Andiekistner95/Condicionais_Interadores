/*
 * Peça para o usuário digitar o nome completo. Procure o primeiro espaço “ ” (int
posicao = texto.indexOf(&quot; &quot;);). Guarde o valor. Procure agora pelo o último espaço “ ”
no qual fizemos no exercício anterior. Agora, utilizando a função substring (texto =
texto.substring(0, 10);), insira os dois valores guardados anteriormente, e imprima o
texto resultante.
 */
package exercicio.numero23;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digitar seu nome completo");
		String nome = scanner.nextLine();
		scanner.close();

		int posicao1 = nome.indexOf(" ");
		int posicao2 = nome.lastIndexOf(" ");
		posicao1++;
		
		nome = nome.substring(posicao1,posicao2);

		System.out.println(nome);

	}
}

