/*
 * Pe�a para o usu�rio digitar o nome completo. Procure o primeiro espa�o � � (int
posicao = texto.indexOf(&quot; &quot;);). Guarde o valor. Procure agora pelo o �ltimo espa�o � �
no qual fizemos no exerc�cio anterior. Agora, utilizando a fun��o substring (texto =
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

