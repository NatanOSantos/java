package aula_03;

import java.util.Scanner;

public class Aula3Exer4 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
			String nome;
			int cargo;
			float salarioAtual;
			float reajusteGe;
			float reajusteVen;
			float reajusteSup;
			float reajusteMot;
			float reajusteEst;
			float reajusteTi;
			
	
			
			
			System.out.println ("qual seu nome? ");
			nome = leia.nextLine();
			
			System.out.println (" 1 - gerente  10%" );
			System.out.println ("2 - vendedor 7%" );
			System.out.println ("3 -supervisor 9%" );
			System.out.println ("4 - motorista 6%" );
			System.out.println ("5 - estoquista 5% ");
			System.out.println ("6 - tecnico de TI 8% " );
		
			System.out.print ("digite o numero referente a sua profissão");
			cargo = leia.nextInt();
			
			System.out.println ("digite seu salario mensal");
			salarioAtual = leia.nextFloat();
		
			reajusteGe = (salarioAtual * 10 / 100);
			reajusteVen = (salarioAtual * 7 / 100);
			reajusteSup = (salarioAtual * 9 / 100);
			reajusteMot = (salarioAtual * 6 / 100);
			reajusteEst = (salarioAtual * 5 / 100);
			reajusteTi = (salarioAtual * 8 / 100);
			
			switch(cargo) {
			case 1:{
				System.out.println ("seu novo salario " + (nome) + " " + ( salarioAtual + reajusteGe));
				break;
			}
			
			
			case 2:{
				System.out.println ("seu novo salario " + (nome ) + " " + ( salarioAtual + reajusteVen));
				break;
			}
			
			case 3:{
				System.out.println ("seu novo salario " + (nome ) + " " + ( salarioAtual + reajusteSup));
				break;		
			}
			case 4:{
				System.out.println ("seu novo salario " + (nome) + " " + ( salarioAtual + reajusteMot));
				break;
			}
			case 5:{
				System.out.println ("seu novo salario " + (nome) + " " + ( salarioAtual + reajusteEst));
				break;			
			}
			case 6:{
				System.out.println ("seu novo salario " + (nome) + " " + ( salarioAtual + reajusteTi));
				break;		
			}	
			}
		}

	}
 
