package aula_04exercicios;

import java.util.Scanner;

public class Aula_04_Exer5 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero, soma = 0;

        do {
            System.out.println("Digite um número (0 para encerrar):");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma de todos os números positivos digitados é: " + soma);
    }
}
