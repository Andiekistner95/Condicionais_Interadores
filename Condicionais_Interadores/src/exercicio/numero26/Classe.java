/*
 * Da data em texto “25/05/2015”, extraia o dia, mês e ano e imprima a data da
   seguinte forma (O dia é {dia}, do mês {mês}, do ano {ano}).
 */
package exercicio.numero26;

public class Classe {
	public static void main(String[] args) {

		String data = "25/05/2015";

		String[] lista = data.split("/");

		String dia = lista[0];
		String mes = lista[1];
		String ano = lista[2];

		System.out.println("O dia é " + dia + ", do mês " + mes + ", do ano " + ano);

	}
}
