package aulajava02;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;

		System.out.println("Informe sua idade: ");
		idade = entrada.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria Infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria Juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria Adulto.");
		} else {
			System.out.println("Você não se encaixa em nenhuma das categorias.");
		}
		entrada.close();
	}
}