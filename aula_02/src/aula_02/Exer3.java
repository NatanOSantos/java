package aula_02;

import java.util.Scanner;

public class Exer3 {

		static Scanner leia = new Scanner(System.in);
		public static void main(String[] args) {
			float salario;
			float horaExtra;
			float adcionalNoturno;
			float desconto;
			System.out.println ("digite seu salario mensal");
			System.out.println ("digite sua hora extra");
			System.out.println ("digite seu adcional noturno");
			System.out.println ("digite a quantidade de desconto");
			salario = leia.nextFloat();
			horaExtra = leia.nextFloat();
			adcionalNoturno = leia.nextFloat();
			desconto = leia.nextFloat();
			float total =  (salario + (horaExtra*5) + adcionalNoturno - desconto);
			System.out.println ("sua salario é final é " + total);

	}

}
