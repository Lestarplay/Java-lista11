package lista11;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
		        int numero = scanner.nextInt();

		        if (numero < 0) {
		            System.out.println("Fatorial não é definido para números negativos.");
		        } else {
		            long fatorial = 1;
		            for (int i = 2; i <= numero; i++) {
		                fatorial *= i;
		            }

		            System.out.println("O fatorial de " + numero + " é " + fatorial);
		        }

		        scanner.close();
		    }

	}

