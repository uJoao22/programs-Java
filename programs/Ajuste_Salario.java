package Lista_1;

import java.util.Scanner;

public class Ajuste_Salario { /*Fa�a um algoritmo em Java que ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. Calcular e 
							escrever o valor do novo sal�rio.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que ajusta o valor do sal�rio de funcion�rios");
		
		System.out.println("\nQual o valor do sal�rio?");
		float sal = sc.nextFloat();
		
		System.out.println("\nQual o percentual de reajuste?");
		float percent = sc.nextFloat();
		
		float x = percent / 100;
		float nsal = sal - (x * sal);
		
		System.out.println("\nO valor do sal�rio ajustado �: " +nsal);

		sc.close();
	}
}