package aula_03;

import java.util.Scanner;

public class Aula3Exer1 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		int numeroC;
		System.out.println ("digite o Primeiro numero? ");
		numeroA = leia.nextInt();
		
		System.out.println ("digite o Segundo numero? ");
		numeroB = leia.nextInt();
		
		System.out.println ("qual o Terceiro numero? ");
		numeroC = leia.nextInt();
		
		
		if (numeroA + numeroB > numeroC) {
			System.out.println ("A soma do Primeiro " + (numeroA) + " e Segundo Numero " + (numeroB) + " é maior que o Terceiro Numero " + (numeroC));
		}
		else if (numeroA + numeroB < numeroC) {
			System.out.println ("A soma do Primeiro " + (numeroA) + " e Segundo Numero " + (numeroB) + " é menor que o Terceiro Numero " + (numeroC));
		}
		else {
			System.out.println ("A soma do Primeiro " + (numeroA) + " e Segundo Numero " + (numeroB) + " é igual ao terceiro " + (numeroC));
			}
	}

}
