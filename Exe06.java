package lista11;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		        int n = 10; 
		        int primeiro = 0, segundo = 1;

		        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

		        for (int i = 0; i < n; i++) {
		            System.out.print(primeiro + " ");

		            int proximo = primeiro + segundo;
		            primeiro = segundo;
		            segundo = proximo;
		        }
		    }

	}

