package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ano;

		System.out.println(" Digite um ano e vou te dizer se ele � bissexto ");
		ano = teclado.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");

		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " � bissexto. ");
		} else {
			System.out.println(ano + " n�o � bissexto ");
		}
	}
}
