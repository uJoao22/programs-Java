package Lista_3;

import java.util.Scanner;

public class Vetor_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[10], soma=0;
		
		for(int i = 0; i< vet.length; i++) {
			System.out.println("Digite um n�mero:");
			int num =sc.nextInt();
			vet[i]= num;
			soma = soma + vet[i];
		}

		soma = soma/10;
		
		System.out.println("\nA m�dia �: " +soma);
		
		sc.close();
	}
}