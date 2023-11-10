package aula_03;

import java.util.Scanner;

public class Aula3Exer3 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
			String nome;
			int lanches;
			int quantidade; 
			float cachorroQuente = 10; 
			float x_Bacon = 18; 
			float x_Salada = 15; 
			float bauru = 12; 
			float refri = 8; 
			float suco = 13; 
			
			
			System.out.println ("qual seu nome? ");
			nome = leia.nextLine();
			
			System.out.println ("lanches ");
			System.out.println ("1 - Cachorro Quente " + (cachorroQuente));
			System.out.println ("2 - X-salada " + (x_Salada));
			System.out.println ("3 - X-bacon " + (x_Bacon));
			System.out.println ("4 - Bauru " + (bauru));
			System.out.println ("5 - Refri " + (refri));
			System.out.println ("6 - Suco " + (suco));
			
			
			System.out.print ("digite o numero referente ao produto que você deseja");
			lanches = leia.nextInt();
			
			System.out.print ("digite a quantidade desejada");
			quantidade = leia.nextInt();
		
			
			switch(lanches) {
			case 1:{
				System.out.println ("Obrigado pela compra " + (nome) + " o valor total do seu pedido é R$ " + (quantidade * 10));
				break;
			}
			
			
			case 2:{
				System.out.println ("o valor total do seu pedido é " + (quantidade * 15));
				break;
			}
			
			case 3:{
				System.out.println ("o valor total do seu pedido é " + (quantidade * 18));
				break;		
			}
			case 4:{
				System.out.println ("o valor total do seu pedido é " + (quantidade * 12));
				break;
			}
			case 5:{
				System.out.println ("o valor total do seu pedido é " + (quantidade * 8));
				break;			
			}
			case 6:{
				System.out.println ("o valor total do seu pedido é " + (quantidade * 13));
				break;		
			}	
			}
		}

	}
