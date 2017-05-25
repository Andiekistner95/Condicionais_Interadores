/*
 *   10. Peça para o usuário digitar dois números double. E efetue as seguintes validações:
a. Se a soma dos números for maior que 20, imprima no console “<resultado da
   soma> é maior que 20”
b. Se a soma dos números for maior que 30, imprima no console “<resultado da
   soma> é maior que 30”
c. Se a soma dos números for maior que 10 ou maior que 20, imprima no
   console “<resultado da soma> é maior que 10 ou <resultado da soma> maior que 20 ”
d. Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no console
   “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10”
e. Se a soma dos número é múltiplo de 5 e múltiplo de 10, ou o primeiro
   número digitado é 5, imprima no console “<resultado da soma> é múltiplo de
   5 e <resultado da soma> de 10 ou o <primeiro número digitado> é 5”
 */
package exercicio.numero10;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número double");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite outro número double");
		double n2 = scanner.nextDouble();
		scanner.close();

		if ((n1 + n2) > 20) {
			System.out.println(n1 + n2 + " é maior que 20");
			
		} else if ((n1 + n2) > 30) {
			System.out.println(n1 + n2 + " é maior que 30");
			
		} else if ((n1 + n2) > 10 || ((n1 + n2) > 20)) {
			System.out.println(n1 + n2 + " é maior que 10 ou " + n1 + n2 + " é maior que 20");
			
		} else if ((n1 + n2) % 5 == 0 && (n1 + n2) % 10 == 0) {
			System.out.println(n1 + n2 + " é multiplo de 5 e " + n1 + n2 + " é multiplo de 10");
			
		} else if ((n1 + n2) % 5 == 0 && (n1 + n2) % 10 == 0 || n1 == 5) {
			System.out.println(n1 + n2 + " é multiplo de 5 e " + n1 + n2 + " é multiplo de 10 ou o " + n1 + " é 5.");

		}
	}
}
