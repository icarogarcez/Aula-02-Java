package aulajava02;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, contador, maior = 0;
		System.out.println(entrada);

		for (contador = 0; contador < 3; contador++) {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println ("O maior n�mero inserido foi: " + maior);
		entrada.close();
	}

}