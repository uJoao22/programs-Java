package Lista_1;

import java.util.Scanner;

public class Num_Maior_10 { /*Fa�a um algoritmo em Java que ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, 
							caso contr�rio escrever N�O � MAIOR QUE 10!*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que fala se um n�mero � maior que 10");
		
		System.out.println("\nDigite um n�mero");
		int num = sc.nextInt();
		
		if(num > 10) {
			System.out.println("� MAIOR QUE 10!");
		} else if(num == 10) {
			System.out.println("� IGUAL A 10!");
		}else{
			System.out.println("N�O � MAIOR QUE 10!");
		}
		
		sc.close();
	}
}