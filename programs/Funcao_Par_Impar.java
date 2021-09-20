package lista_2;

import java.util.Scanner;

public class Funcao_Par_Impar {
	
	public static int dif(int x){
		if (x%2 == 0) {
			System.out.println("\nO n�mero � par");
		} else {
			System.out.println("\nO n�mero � impar");
		}
		return x;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra se um n�mero � par ou impar usando fun��es");
		
		System.out.println("\nDigite um n�mero: ");
		int num = sc.nextInt();		
		
		dif(num);
	
		sc.close();
	}
}