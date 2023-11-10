package aula_04exercicios;

import java.util.Scanner;

public class Aula_04_Exerc3 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, menorQue21 = 0, maiorQue50 = 0;

		System.out.println("Digite as idades (número negativo para encerrar):");
		idade = leia.nextInt();
		while (idade >= 0) {
			if (idade < 21) {
				menorQue21++;
			} else if (idade > 50) {
				maiorQue50++;
			}
			idade = leia.nextInt();
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + menorQue21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maiorQue50);
	}
}