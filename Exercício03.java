package aulajava02;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;

		System.out.println("Informe sua idade: ");
		idade = entrada.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Voc� est� na categoria Infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Voc� est� na categoria Juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� est� na categoria Adulto.");
		} else {
			System.out.println("Voc� n�o se encaixa em nenhuma das categorias.");
		}
		entrada.close();
	}
}