package aulaP2;

import java.util.Scanner;

public class Inicio_Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[5];
		
		for(int i = 0; i< vet.length; i++) {
			System.out.println("Digite um número:");
			vet[i]=sc.nextInt();
		}
		for(int i = 0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
		sc.close();
	}
}