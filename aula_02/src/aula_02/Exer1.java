package aula_02;

import java.util.Scanner;

public class Exer1 {
	static Scanner leia = new Scanner(System.in);
		public static void main(String[] args) {
			float salario;
			float abono;
			System.out.println ("digite seu salario");
			System.out.println ("digite seu abono");
			abono = leia.nextFloat();
			salario = leia.nextFloat();
			System.out.println ("seu novo salario é " + (abono + salario));

	}

}
