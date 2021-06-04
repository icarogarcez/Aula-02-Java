package aulajava02;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero, potencia, quadrado;

		System.out.println("Insira um número: ");
		numero = ler.nextDouble();

		if (numero % 2 != 0) {
			potencia = Math.pow(numero, 2);
			System.out.println ("O número " + numero + " é ímpar. \nE " + numero + " ao quadrado é " + potencia + ".");
		} else {
			quadrado = Math.sqrt(numero);
			System.out
					.println ("O número " + numero + " é par. \nE a raiz quadrada de " + numero + " é " + quadrado + ".");
		}
		ler.close();
	}

}