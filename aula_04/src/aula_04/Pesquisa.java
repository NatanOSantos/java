package aula_04;

import java.util.Scanner;

public class Pesquisa {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	int idade, esporte, futebol = 0, voleibolM18 = 0, baquetebolMen18 = 0; 
	String continua = "S";
	
	while(continua.equalsIgnoreCase("S")) {
		
		System.out.println("digite sua idade");
		idade = leia.nextInt();
		
		System.out.println("digite o seu esporte favorito (1- Fut / 2- Vol /3- Basq: ");
		esporte = leia.nextInt();
		
	if (esporte ==1)
		futebol ++;
	
	if (esporte ==2 && idade > 18)
		voleibolM18 ++;
	
	if (esporte ==3 && idade < 18)
		baquetebolMen18 ++;
	
	System.out.println("deseja continuar (S/N)?");
	leia.skip ("\\R");
	continua = leia.next().toUpperCase();
	}
	System.out.println("Total de pessoas que gostam de  futebol:" + futebol);
	System.out.println("Total de pessoas que gostam de  volei e são maiores de 18 anos:" + voleibolM18);
	System.out.println("Total de pessoas que gostam de  baquete e são menores de 18 anos:" + baquetebolMen18);
	
	
	
	

	}

}
