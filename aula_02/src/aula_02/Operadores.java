package aula_02;

import java.util.Scanner;

public class Operadores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1 = 10, numero2 = 20;
		float media = 2.451654f;
		int altura;
		System.out.println ("a soma dos dois numeros é " + (numero1 + numero2));
		System.out.printf ("a media é %.2f", media);
		System.out.println ("digite sua altura");
		altura = leia.nextInt();
		System.out.println ("sua altura é" + (altura));
		
	}

}
