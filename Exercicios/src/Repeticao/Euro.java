package Repeticao;

import java.util.Scanner;

public class Euro {
	
	public static void main(String[] args) {
	    
	    double valorReais, valorEuros, soma = 0;
	    int grupo, cont;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de pessoas que viajarão: ");
		grupo = entrada.nextInt();
		System.out.println();
		
		for (cont = grupo; cont > 0; cont --){
		    System.out.print("Digite quanto você economizou para a viagem: ");
		    valorReais = entrada.nextDouble();
		    
		    if (valorReais < 0){
		        do {
		            System.out.print("Digite um valor válido: ");
		            valorReais = entrada.nextDouble();
		        } while (valorReais < 0);
		        
		    }
		    
		    valorEuros = valorReais / 6.73;
		    soma = soma + valorEuros;
		    System.out.println("Você economizou " + valorEuros + " euros para a viagem.");
		    System.out.println();
		    
		}
	
		System.out.println ("Total de euros para a viagem: " + soma);
		
	}

}
