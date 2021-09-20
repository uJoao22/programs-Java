package lista_2;

import java.util.Scanner;

public class Funcao_Par_Impar {
	
	public static int dif(int x){
		if (x%2 == 0) {
			System.out.println("\nO número é par");
		} else {
			System.out.println("\nO número é impar");
		}
		return x;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra se um número é par ou impar usando funções");
		
		System.out.println("\nDigite um número: ");
		int num = sc.nextInt();		
		
		dif(num);
	
		sc.close();
	}
}