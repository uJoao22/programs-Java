package Lista_3;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[10];
		
		for(int i = 0; i< vet.length; i++) {
			System.out.println("Digite um n�mero:");
			int num =sc.nextInt();
			vet[i]= num;
		}
		for(int i = 0; i<vet.length; i++) {
			System.out.print(vet[i]+ " - ");
		}
		
		Arrays.sort(vet);
		
		int maior = vet[9];
		
		System.out.println("\nO maior n�mero �: " +maior);
		
		sc.close();
	}
}