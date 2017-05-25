/*
 * Peça para o usuário digitar a idade e ano de nascimento. Pegue os valores que o
usuário digitou. Verifique se a idade digitada condiz com o ano de nascimento do
usuário, ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima
“Você não mentiu para mim”, caso contrário, imprima “Você mentiu para mim, você
não é mais meu amigo”.
 */
package exercicio.numero5;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu ano de nascimento");
		int ano = scanner.nextInt();
		
		if(2017 - idade == ano){
			System.out.println("Você não mentiu para mim");
		}else{
			System.out.println("Você mentiu para mim, você não é mais meu amigo");
			scanner.close();
		}
		scanner.close();
	}
	}


