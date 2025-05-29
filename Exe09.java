package lista11;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		
		        int soma = 0;
		        int quantidade = 10;

		        System.out.println("Digite " + quantidade + " números inteiros:");

		        for (int i = 1; i <= quantidade; i++) {
		            System.out.print("Número " + i + ": ");
		            int numero = sc.nextInt();
		            soma += numero;
		        }

		        double media = (double) soma / quantidade;
		        System.out.println("A média dos números é: " + media);

		        sc.close();
		    }
		
       }
	


