/*
 * Escreve um algoritmo que o usu�rio entre com tr�s n�meros e imprima o maior
   n�mero entre eles, utilizando apenas um System.out.println.
 */
package exercicio.numero11;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int n1 = scanner.nextInt();
		int maior = n1;
		System.out.println("Digite um n�mero");
		int n2 = scanner.nextInt();
		if (n2 > maior) {
			maior = n2;
		}
		System.out.println("Digite um n�mero");
		int n3 = scanner.nextInt();
		if (n3 > maior) {
			maior = n3;
		}
		System.out.println("O maior n�mero �: " +maior);
	scanner.close();
	}
}
