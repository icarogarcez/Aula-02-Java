package aulajava02;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero, potencia, quadrado;

		System.out.println("Insira um n�mero: ");
		numero = ler.nextDouble();

		if (numero % 2 != 0) {
			potencia = Math.pow(numero, 2);
			System.out.println ("O n�mero " + numero + " � �mpar. \nE " + numero + " ao quadrado � " + potencia + ".");
		} else {
			quadrado = Math.sqrt(numero);
			System.out
					.println ("O n�mero " + numero + " � par. \nE a raiz quadrada de " + numero + " � " + quadrado + ".");
		}
		ler.close();
	}

}