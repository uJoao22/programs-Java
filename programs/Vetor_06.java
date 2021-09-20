package Lista_3;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[10];
		
		for(int i = 0; i< vet.length; i++) {
			System.out.println("Digite um número:");
			int num =sc.nextInt();
			vet[i]= num;
		}
		
		Arrays.sort(vet);
		
		for(int i = 0; i<vet.length; i++) {
			System.out.print(vet[i]+ " - ");
		}
		
		sc.close();
	}
}