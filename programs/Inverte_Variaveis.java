package Lista_1;

import java.util.Scanner;

public class Inverte_Variaveis { /*Faça um algoritmo em Java que ler 2 números inteiros do teclado (lembrar de colocar as informações do que é para ser 
							feito para o usuário) os coloque em variáveis A e B. A seguir (utilizando apenas atribuições entre variáveis) troque 
							os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que 
							ficaram armazenados nas variáveis. */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que inverte valores de váriaveis");
		
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