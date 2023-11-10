package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
	
		String nome;
		int faixaidade;
		
		System.out.println ("qual seu nome? ");
		nome = leia.nextLine();
		
		System.out.println ("faixas Etarias ");
		System.out.println ("1 - de 0 a 10 anos ");
		System.out.println ("2 - de 10 a 29 anos ");
		System.out.println ("3 - de 30 a 45 anos ");
		System.out.println ("4 - de 46 a 59 anos ");
		System.out.println ("5 - de 60 a 65 anos ");
		System.out.println ("6 - acima de 65 anos ");
		
		System.out.print ("digite sua faixa etaria");
		faixaidade = leia.nextInt();
		
		switch(faixaidade) {
		case 1:
			System.out.printf()
		}
	}

}
