/*
 * Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou.
Verifique se o n�mero � �mpar, caso sim, imprima �o valor digitado � �mpar�, caso
contr�rio imprima �o valor � par�.
 */
package exercicio.numero2;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();
		
		if(numero % 2 != 0){
			System.out.println("Valor digitado � �mpar");
		}else{
			System.out.println("Valor digitado � par");
			scanner.close();
		}
		
	}
	}
