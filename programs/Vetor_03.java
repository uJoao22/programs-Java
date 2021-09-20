package Lista_3;

import java.util.Scanner;

public class Vetor_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[10], num = 0, pos = 0;
		
		for(int i = 0; i< vet.length; i++) {
			System.out.println("Digite um n�mero:");
			vet[i] =sc.nextInt();
		}
			
		for(int i=0; i<10; i++){ 
			
		    if(vet[i] < num || i == 0){    
		    num = vet[i];
		    pos = i;   
		    }  
		}
		
		System.out.println("\nO menor n�mero �: " +num+ " e a posi��o dele �: " +pos);

		sc.close();
	}
}