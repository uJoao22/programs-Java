package Lista_1;

import java.util.Scanner;
import java.util.Random;

public class Sorteio_Adivinha { /*Faça um algoritmo em Java que utilize as duas linhas iniciais no método Main() sejam: 
							Random rnd = new Random(); //Inicia Aleatório 
							int x = rnd.nextInt(100); //Gera um número aleatório (0 à 99) 
							Faça um laço de repetição que solicite ao usuário digitar um número (lembrar de colocar as informações do que é para 
							ser feito para o usuário). O laço encerra quando o usuário acertar o número sorteado. Se o número do usuário for menor 
							que o oculto (sorteado), escrever: É MAIOR!, se o número do usuário for maior que o oculto (sorteado), escrever: É MENOR!. 
							Ao final deve ser mostrado que acertou e quantas tentativas foram feitas.*/

	public static void main(String[] args) {
		Random rnd = new Random();
		int x = rnd.nextInt(100);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que sorteia um número para você adivinhar\n\n");
		
		System.out.println("Tente a sorte!");
		System.out.println("Digite um número de 0 a 99");
		int num = sc.nextInt();
		
		while(num != x) {
			
			if(num > x) {
				System.out.println("\nÉ MENOR!");
			} else {
				System.out.println("\nÉ MAIOR!");
			}
			
			System.out.println("Tente novamente");
			num = sc.nextInt();
		}
		
		System.out.println("\nAcertou!");
		
		sc.close();
	}
}