package aula_02;

import java.util.Scanner;

public class Exer2Media {
	
	static Scanner leia = new Scanner(System.in);
		public static void main(String[] args) {
			float notaPriBimestre;
			float notaSegBimestre;
			float notaTerBimestre;
			float notaQuarBimestre;
			System.out.println ("digite sua nota no primeiro bimentre");
			System.out.println ("digite sua nota no segundo bimentre");
			System.out.println ("digite sua nota no terceiro bimentre");
			System.out.println ("digite sua nota no quarto bimentre");
			notaPriBimestre = leia.nextFloat();
			notaSegBimestre = leia.nextFloat();
			notaTerBimestre = leia.nextFloat();
			notaQuarBimestre = leia.nextFloat();
			float total =  (notaPriBimestre + notaSegBimestre + notaTerBimestre + notaQuarBimestre);
			System.out.println ("sua media é final é " + (total/4));

	}

}
