package Repeticao;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		int numero, quadrado;
		Scanner entrada = new Scanner(System.in);
		
		do {
		    System.out.print("Digite um numero: ");
		    numero = entrada.nextInt();
		    quadrado = numero*numero;
		    System.out.println(quadrado);
		} while(numero !=0);

	}

}
