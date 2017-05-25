/*
 * Peça para o usuário digitar um número, pegue o número que o usuário digitou.
Verifique se o número é ímpar, caso sim, imprima “o valor digitado é ímpar”, caso
contrário imprima “o valor é par”.
 */
package exercicio.numero2;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = scanner.nextInt();
		
		if(numero % 2 != 0){
			System.out.println("Valor digitado é ímpar");
		}else{
			System.out.println("Valor digitado é par");
			scanner.close();
		}
		
	}
	}
