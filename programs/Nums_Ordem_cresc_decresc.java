package aulaP2;

import java.util.Scanner;

public class Nums_Ordem_cresc_decresc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa para colocar 3 números em ordem crescente e decrescente \n");
		System.out.println("Você deseja saber seus números em qual ordem? \n Digite 1 para ordem crescente \n Digite 2 para ordem decrescente \n Digite 3 para ambas \n");
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("\nDigite o primeiro número:");
			int num1 = sc.nextInt();
			
			System.out.println("\nDigite o segundo número:");
			int num2 = sc.nextInt();
			
			System.out.println("\nDigite o terceiro número:");
			int num3 = sc.nextInt();
			
			if(num1 > num2 && num2 > num3) {
				System.out.println("\n A ordem crescente ficará: " +num1+ ", " +num2+ " e " +num3);
			} else if (num1 > num2 && num3 > num2) {
					System.out.println("\n A ordem crescente ficará: " +num1+ ", " +num3+ " e " +num2);
			}
			break;
			
		case 2:
			System.out.println("Digite o primeiro número:");
			int num4 = sc.nextInt();
			
			System.out.println("Digite o segundo número:");
			int num5 = sc.nextInt();
			
			System.out.println("Digite o terceiro número:");
			int num6 = sc.nextInt();
			
			if(num4 > num5 && num4 > num6) {
				System.out.println(num4);
			}
			break;
			
		case 3:
			System.out.println("Digite o primeiro número:");
			int num7 = sc.nextInt();
			
			System.out.println("Digite o segundo número:");
			int num8 = sc.nextInt();
			
			System.out.println("Digite o terceiro número:");
			int num9 = sc.nextInt();
			
			if(num7 > num8 && num7 > num9) {
				System.out.println(num7);
			}
			break;
		}
		
		sc.close();
	}
}