/*
 * b. Verifique se o usu�rio mora em �Blumenau� e no bairro �Fortaleza�, caso sim,
   imprima �Voc� se atrasar� muito mais para o trabalho!�.
 */
package exercicio.numero6.itemb;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Blumenau")) && (bairro.equals("Fortaleza"))) {
			System.out.println("Voc� se atrasar� muito mais para o trabalho!");
			scanner.close();
		}
	}
}
