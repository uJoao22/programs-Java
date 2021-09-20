package Lista_1;

import java.util.Scanner;

public class Numeros_Fracionarios { /*Fa�a um algoritmo em Java que ler 3 n�meros fracion�rios do teclado (lembrar de colocar as informa��es do que � para 
							ser feito para o usu�rio), ao final informar ao usu�rio se o primeiro � maior do que a soma dos dois �ltimos.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que informa se o primeiro n�mero � maior que a soma dos dois �ltimos");
		
		System.out.println("\nDigite o primeiro n�mero fracion�rio:");
		float num1 = sc.nextFloat();
		
		System.out.println("\nDigite o segundo n�mero fracion�rio:");
		float num2 = sc.nextFloat();
				
		System.out.println("\nDigite o terceiro n�mero fracion�rio:");
		float num3 = sc.nextFloat();
		
		if(num1 > num2 + num3) {
			System.out.println("\nO primeiro n�mero � maior que a soma dos dois �ltimos.");
		} else {
			System.out.println("\nA soma dos dois �ltimos � maior que o primeiro n�mero.");
		}
		
		sc.close();
	}
}
