package lista_2;

import java.util.Scanner;

public class Funcao_Antecessor {
	
	public static int ant(int x, int y){
		x = y-1;
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra o antecessor de um número usando funções");
		
		System.out.println("\nDigite um número: ");
		int num = sc.nextInt();
		
		System.out.println("\nSeu antecessor é: " +ant(num,num));
		
		sc.close();
	}
}