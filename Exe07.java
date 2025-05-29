package lista11;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		        int contador = 0;

		        System.out.println("Números divisíveis por 3 entre 1 e 50:");

		        for (int i = 1; i <= 50; i++) {
		            if (i % 3 == 0) {
		                System.out.print(i + " ");
		                contador++;
		            }
		        }

		        System.out.println("\nTotal de números divisíveis por 3: " + contador);
		    }
	}

