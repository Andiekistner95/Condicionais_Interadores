/*
 * Peça para o usuário digitar um número, pegue o número que o usuário digitou.
Verifique se o número é maior que 10, caso sim, imprima “o valor digitado é maior
que 10”, caso contrário imprima “o valor digitado é menor que 10”.
 */
package exercicio.numero1;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int numero = scanner.nextInt();
	
	if(numero > 10){
		System.out.println("Valor digitado é maior que 10");
	}else{
		System.out.println("Valor digitado é menor que 10");
		scanner.close();
	}
	
}
}
