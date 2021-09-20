package Lista_3;

import java.util.Scanner;

public class Vetor_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[10];
		
		for(int i = 0; i< vet.length; i++) {
			System.out.println("Digite um número:");
			vet[i] =sc.nextInt();
		}		
		for(int i = vet.length-1; i>=0; i--) {
			System.out.print(vet[i]+ " - ");
		}
		
		sc.close();
	}
}