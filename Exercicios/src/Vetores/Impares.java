package Vetores;

/******************************************************************************

Exercício 1. Escreva um programa Java que declare um vetor de inteiros de 5
posições e o preencha com os 5 primeiros números ímpares e imprima-o

*******************************************************************************/
import java.util.Scanner;

public class Impares
{
	public static void main(String[] args) {
		
		int [] vetor = new int[5];
		int n = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0;i<5;i++){
		    
		    vetor[i] = n;
		    n = n + 2;
		}
	    
	    for (int i=0;i<5;i++){
            System.out.print(vetor[i] + " ");
	    }	
	    
	}
}
