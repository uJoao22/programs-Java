package Lista_1;

import java.util.Scanner;

public class Boletim { /*Faça um algoritmo em Java que ler um número inteiro do teclado (lembrar de colocar as informações do que é para ser 
							feito para o usuário), este número representa uma nota. Mostre o conceito da nota. A= 90 à 100; B= 80 à 89; C= 70 à 79; 
							D = 60 à 69; E= 0 à 59. Verificar se a nota é válida.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para calcular nota");

		System.out.println("\nQual a sua nota?");
		int nota = sc.nextInt();
		
		if (nota >= 90 && nota<=100){
			System.out.println("\nVocê tirou A");
		}
		else if (nota >= 80 && nota<=89){
			System.out.println("\nVocê tirou B");
		}
		else if (nota >= 70 && nota<=79){
			System.out.println("\nVocê tirou C");
		}
		else if (nota >= 60 && nota<=69){
			System.out.println("\nVocê tirou D");
		}
		else if (nota >= 0 && nota<=59){
			System.out.println("\nVocê tirou E");
		} 
		
		sc.close();
	}
}
