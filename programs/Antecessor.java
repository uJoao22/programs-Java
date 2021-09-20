import java.util.Scanner;

public class Antecessor { //Faça um algoritmo em Java que ler um valor (do teclado) e escrever (na tela) o seu antecessor.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que mostra o antecessor de um número digitado");
		
		System.out.println("\nDigite um número:");
		int num = sc.nextInt();
		
		int ant= num-1;
		
		System.out.println("O antecessor de " +num+ " é " +ant);
		
		sc.close();
	}
}