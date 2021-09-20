package Lista_1;

import java.util.Scanner;

public class Inverte_Variaveis { /*Fa�a um algoritmo em Java que ler 2 n�meros inteiros do teclado (lembrar de colocar as informa��es do que � para ser 
							feito para o usu�rio) os coloque em vari�veis A e B. A seguir (utilizando apenas atribui��es entre vari�veis) troque 
							os seus conte�dos fazendo com que o valor que est� em A passe para B e vice-versa. Ao final, escrever os valores que 
							ficaram armazenados nas vari�veis. */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que inverte valores de v�riaveis");
		
		System.out.println("\nDigite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("\nDigite o valor de B:");
		int b = sc.nextInt();
		
		int x = a;
		a = b;
		b = x;
		
		System.out.println("\nO valor de A ficou " +a);
		System.out.println("O valor de B ficou: "+b);
		
		sc.close();
	}
}