/*
 * Escreve um algoritmo que o usuário entre com três números, e imprima os números
   em ordem decrescente.
 */
package exercicio.numero12;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");

		int n1 = scanner.nextInt();
		int maior = n1;
		int meio = n1;
		int menor = n1;

		System.out.println("Digite um número");
		int n2 = scanner.nextInt();

		if (n2 > maior) {
			meio = maior;
			maior = n2;
		} else {
			meio = n2;
		}
		System.out.println("Digite um número");
		int n3 = scanner.nextInt();

		if (n3 > maior) {
			menor = meio;
			meio = maior;
			maior = n3;
		} else if (n3 > meio) {
			menor = meio;
			meio = n3;
		} else {
			menor = n3;
		}
		System.out.println(maior);
		System.out.println(meio);
		System.out.println(menor);
		scanner.close();
	}
}