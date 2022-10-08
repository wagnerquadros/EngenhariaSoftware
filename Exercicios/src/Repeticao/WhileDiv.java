package Repeticao;

import java.util.Scanner;

public class WhileDiv {

	public static void main(String[] args) {
		int numero, divisao;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print ("Digite um numero: ");
		numero = entrada.nextInt();
		
		while (numero >0) {
		    
		    numero = numero/2;
		    System.out.print(numero + " ");
		}

		
		}
}
