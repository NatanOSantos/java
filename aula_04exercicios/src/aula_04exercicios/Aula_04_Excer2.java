package aula_04exercicios;

import java.util.Scanner;

public class Aula_04_Excer2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		int numerosPares = 0;
        int numerosImpares = 0;

        for (int contador = 0; contador < 10; contador++) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            numero = leia.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);

	}

}
