/*
 * Um comerciante comprou um produto e quer vende-lo com um lucro de 50% se o
   valor da compra for menor que R$ 20,00. Caso contrário, o lucro será 35%.
   Entrar com o valor do produto e imprimir o valor de venda.
 */
package exercicio.numero14;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do produto");
		int valor = scanner.nextInt();
		scanner.close();

		if (valor < 20) {
			System.out.println("Valor do produto:" + valor + " Valor da venda:" + (valor * 1.5));
		} else
			System.out.println("Valor do produto:" + valor + " Valor da venda:" + (valor * 1.35));
	}
}
