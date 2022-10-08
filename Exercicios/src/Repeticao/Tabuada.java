package Repeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int cont, numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		numero = entrada.nextInt();
		
		for (cont=1; cont<=10; cont++){
		    
	        System.out.println(numero + " X " + cont + " = " + numero*cont);
	        
	        
	    }
	}  
}
