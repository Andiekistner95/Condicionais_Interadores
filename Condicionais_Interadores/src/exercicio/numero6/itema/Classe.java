/*
 * Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a
para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. Com tais
informa��es efetue as seguintes condi��es:

a. Verifique se o usu�rio mora em �Blumenau� e no bairro �Velha�, caso sim,
imprima �Voc� se atrasar� para o trabalho!�.
 */
package exercicio.numero6.itema;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Blumenau")) && (bairro.equals("Velha"))) {
			System.out.println("Voc� se atrasar� para o trabalho!");
			scanner.close();
		}
	}
}
