package aulajava02;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Digite os 3 n�meros:");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();

		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println ("A ordem crescente �: " + numero1 + numero2 + numero3);
		} else if (numero1 <= numero3 && numero2 <= numero3) {
			System.out.println ("A ordem crescente �: " + numero1 + numero3 + numero2);
		} else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.println ("A ordem crescente �: " + numero2 + numero1 + numero3);
		} else if (numero2 <= numero3 && numero2 <= numero1) {
			System.out.println ("A ordem crescente �: " + numero2 + numero3 + numero1);
		} else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.println ("A ordem crescente �: " + numero3 + numero1 + numero2);
		} else {
			System.out.println ("A ordem crescente �: " + numero3 + numero2 + numero1);

			entrada.close();
		}
	}

}
