package Lista_1;

import java.util.Scanner;

public class Ajuste_Salario { /*Faça um algoritmo em Java que ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e 
							escrever o valor do novo salário.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que ajusta o valor do salário de funcionários");
		
		System.out.println("\nQual o valor do salário?");
		float sal = sc.nextFloat();
		
		System.out.println("\nQual o percentual de reajuste?");
		float percent = sc.nextFloat();
		
		float x = percent / 100;
		float nsal = sal - (x * sal);
		
		System.out.println("\nO valor do salário ajustado é: " +nsal);

		sc.close();
	}
}