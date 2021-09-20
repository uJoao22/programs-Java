package Lista_1;

import java.util.Scanner;

public class Boletim { /*Fa�a um algoritmo em Java que ler um n�mero inteiro do teclado (lembrar de colocar as informa��es do que � para ser 
							feito para o usu�rio), este n�mero representa uma nota.Mostre o conceito da nota. A= 90 � 100; B= 80 � 89; C= 70 � 79; 
							D = 60 � 69; E= 0 � 59. Verificar se a nota � v�lida.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para calcular nota");

		System.out.println("\nQual a sua nota?");
		int nota = sc.nextInt();
		
		if (nota >= 90 && nota<=100){
			System.out.println("\nVoc� tirou A");
		}
		else if (nota >= 80 && nota<=89){
			System.out.println("\nVoc� tirou B");
		}
		else if (nota >= 70 && nota<=79){
			System.out.println("\nVoc� tirou C");
		}
		else if (nota >= 60 && nota<=69){
			System.out.println("\nVoc� tirou D");
		}
		else if (nota >= 0 && nota<=59){
			System.out.println("\nVoc� tirou E");
		} 
		
		sc.close();
	}
}
