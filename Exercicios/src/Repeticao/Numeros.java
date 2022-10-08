package Repeticao;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
    	int numero;
    	
    	System.out.print("Escreva um numero entre 1 e 3: ");
    	numero = entrada.nextInt();
    	
    	switch (numero) {
    	    case 1:
    	        System.out.println("Um");
    	        break;
    	    case 2:
    	        System.out.println("Dois");
    	        break;
    	    case 3:
    	        System.out.println("Três");
    	        break;
    	    default:
    	        System.out.println("Inválido");
    	        break;
    	}
    	
	}
}
