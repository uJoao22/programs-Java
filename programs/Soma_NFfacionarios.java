package aulaP2;

import java.util.Scanner;

public class Soma_NFfacionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número fracionário:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Digite mais um número fracionário:");
		double numero2 = sc.nextDouble();
			
		System.out.println("Digite mais um número fracionário:");
		double numero3 = sc.nextDouble();

		if (numero1 > numero2+numero3){
			System.out.println("O primeiro número informado é maior do que a soma dos dois ultimos.");
		}
		else {
			System.out.println("A soma dos dois ultimos números informados é maior que o primeiro número");
		}
		
		sc.close();
	}
}