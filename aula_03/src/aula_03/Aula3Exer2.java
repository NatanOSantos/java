package aula_03;

import java.util.Scanner;

public class Aula3Exer2 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doador;
		
		System.out.println ("qual seu nome? ");
		nome = leia.nextLine();
		
		System.out.println ("qual sua idade? ");
		idade = leia.nextInt();
		
		System.out.println ("você já fez alguma doação de sangue? (true para sim, false para não) ");
		doador = leia.nextBoolean();
		
		
		if (idade > 17 && idade < 70) {
			System.out.println (" Olá " + ( nome ) + " você esta apto a doar");
		}
		else if (doador == true) {
			System.out.println (" Olá " + ( nome ) + " você esta apto a doar");
			}
		else {
			System.out.println (" olá " + ( nome ) + " você não pode doar");
		}
	}

}
