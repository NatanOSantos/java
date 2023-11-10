package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		int idade;
		System.out.println ("qual seu nome? ");
		nome = leia.nextLine();
		
		System.out.println ("qual sua idade? ");
		idade = leia.nextInt();
		
		if (idade < 10) {
			System.out.println (" olá " + ( nome ) + " você pagara  R$ 100 ");
		}	
	}

}
