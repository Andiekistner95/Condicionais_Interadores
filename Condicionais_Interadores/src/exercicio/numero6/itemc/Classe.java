/*
 * c. Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�, caso sim,
   imprima �Voc� tem que sair de madrugada para n�o pegar tr�nsito!�.
 */
package exercicio.numero6.itemc;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Blumenau")) && (bairro.equals("Garcia"))) {
			System.out.println("Voc� tem que sair de madrugada para n�o pegar tr�nsito!");
			scanner.close();
		}
	}
}

