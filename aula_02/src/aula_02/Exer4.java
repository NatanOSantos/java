package aula_02;

import java.util.Scanner;

public class Exer4 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		float num4;
		System.out.println ("digite o numero 1");
		System.out.println ("digite o numero 2");
		System.out.println ("digite o numero 3");
		System.out.println ("digite o numeor 4");
		num1 = leia.nextFloat();
		num2 = leia.nextFloat();
		num3 = leia.nextFloat();
		num4 = leia.nextFloat();
		float diferença =  (num1 * num2) - (num3 * num4);
		System.out.println ("a diferença é" + diferença);

	}

}
