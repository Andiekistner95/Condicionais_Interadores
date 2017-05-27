/*
 * Peça para o usuário digitar sua data de nascimento em texto “01/02/1990”. Busque a
   posição do última barra “/”contida na data. Imprime a posição da barra. (int posicao =
   texto.lastIndexOf(&quot;A&quot;);)
 */
package exercicio.numero21;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digitar sua data de nascimento (dd/mm/aa");
		String data = scanner.nextLine();
		scanner.close();

		int posicao = data.lastIndexOf("/");

		System.out.println(posicao);

	}
}