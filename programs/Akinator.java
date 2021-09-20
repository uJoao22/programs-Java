package Lista_1;

import java.util.Random;
import java.util.Scanner;

public class Akinator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rnd = new Random();
        int inicial = 1024, fim = 0;

        System.ou.println("Pensem em um número entre 0 e 1024 e ajude akinator a descobrir.");

        for (int i = 0; i <= 9; i++) {
            int x = rnd.nextInt((inicial - fim) + 1) + fim;

            System.out.println("Seu número é maior ou menor que: " + x );
            System.out.println("> para maior, < para menor, = para igual");
            char aux = sc.next().charAt(0);

            if (aux == '>') {
                if (fim < x) {
                    fim = x;
                }
            }
            if (aux == '<') {
                if (inicial > x) {
                    inicial = x;
                }
            }
            if(aux == '=') {
                System.out.println("Acertou!!");
            }
        }

        System.out.println("Fim");

        sc.close();
	}
}