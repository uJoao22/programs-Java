package lista_2;

import java.util.Scanner;

public class Funcao_Boletim {
	
	public static int dif(int x) {
		if (x >= 90 && x<=100){
			System.out.println("\nVoc� tirou A");
		}
		else if (x >= 80 && x<=89){
			System.out.println("\nVoc� tirou B");
		}
		else if (x >= 70 && x<=79){
			System.out.println("\nVoc� tirou C");
		}
		else if (x >= 60 && x<=69){
			System.out.println("\nVoc� tirou D");
		}
		else if (x >= 0 && x<=59){
			System.out.println("\nVoc� tirou E");
		}
		return x;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Programa que mostra sua nota usando fun��es");
		
		System.out.println("\nQual a sua nota?");
		int nota = sc.nextInt();
		
		dif(nota);
		
		sc.close();
	}
}