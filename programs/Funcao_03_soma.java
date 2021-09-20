package aulaP2;

import java.util.Scanner;

public class Funcao_03_soma {
	
	public static int soma(int n1, int n2) {
		return n1+n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o outro número:");
		int num2 = sc .nextInt();
		
		System.out.println("A soma: " +soma(num1,num2));
		
		sc.close();
	}
}