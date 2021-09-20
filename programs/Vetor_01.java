package Lista_3;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[10];
		int entrou=0;
		
		for(int i=0; i< vet.length; i++) {
			System.out.println("Digite um n�mero:");
			vet[i]=sc.nextInt();
		}
		
		for(int i = 0; i<vet.length; i++) {
			if(vet[i] >= 1 && vet[i] <= 50) {
			System.out.print(vet[i]+ " - ");
			entrou++;
			}	
		}
		
		System.out.println("\n" +entrou+ " n�meros que est�o entre 1 e 50");
		
		sc.close();
	}
}