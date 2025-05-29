package lista11;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		        int contador = 0;

		        System.out.println("Números primos entre 1 e 100:");

		        for (int num = 2; num <= 100; num++) {
		            if (ehPrimo(num)) {
		                System.out.print(num + " ");
		                contador++;
		            }
		        }

		        System.out.println("\nTotal de números primos entre 1 e 100: " + contador);
		    }

	
		    public static boolean ehPrimo(int numero) {
		        if (numero <= 1) return false;

		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }


	}


