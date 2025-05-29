package lista11;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int produto = sc.nextInt();
		for(int numero = 1; numero < 11; numero++) {
		  produto = numero * numero ;
		  
		  System.out.println(produto);
		  
		  sc.close();
		}

	}

}
