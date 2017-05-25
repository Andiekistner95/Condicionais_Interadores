/*
 * 7. Calculadora
a. Peça para o usuário digitar um número, e armazene o número.
b. Peça para o usuário digitar um operador matemático (+, -, /, x), e armazene o operador.
c. Peça para o usuário digitar outro número, e armazene o número.
d. Caso o usuário digitou o operador +, some os dois números e imprima o
resultado “Valor da soma: <resultado>”.
e. Caso o usuário digitou o operador -, subtraia os dois números e imprima o
resultado “Valor da subtração: <resultado>”.
f. Caso o usuário digitou o operador /, divida os dois números e imprima o
resultado “Valor da divisão: <resultado>”.
g. Caso o usuário digitou o operador *, multiplique os dois números e imprima o
resultado “Valor da multiplicação: <resultado>”.
 */
package exercicio.numero7;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int n1 = scanner.nextInt();
		System.out.println("Digite um operador matemático (+, -, /, *)");
		String operador = scanner.next();
		System.out.println("Digite outro número");
		int n2 = scanner.nextInt();
		scanner.close();

		switch (operador) {
		case "+":
			System.out.println("Valor da soma: " + (n1 + n2));
			break;
		case "-":
			System.out.println("Valor da subtração: " + (n1 - n2));
			break;
		case "/":
			System.out.println("Valor da divisão: " + (n1 / n2));
			break;
		case "*":
			System.out.println("Valor da multiplicação: " + (n1 * n2));
			break;
		}
	}
}