package Repeticao;

import java.util.Scanner;

public class Sorvete {
	
	public static void main(String[] args) {
	    
	    int opcao, quantidade;
	    double valor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("               MENU               ");
		System.out.println("==================================");
		System.out.println(" 1 - Sorvete Pequeno   - R$ 5,00  ");
		System.out.println(" 2 - Sorvete Médio     - R$ 8,00  ");
		System.out.println(" 3 - Sorvete Grante    - R$ 10,00 ");
		System.out.println("==================================");
		System.out.print("Digite sua opção (1, 2 ou 3): ");
		opcao = entrada.nextInt();
		
		if (opcao != 1 || opcao != 2 || opcao != 3) {
		    do {
		         System.out.print("Digite uma opção válida: ");
		         opcao = entrada.nextInt();
		    } while (opcao != 1 || opcao != 2 || opcao != 3);
		}
		
		System.out.print("Qual a quantidade desejada: ");
		quantidade = entrada.nextInt();
		
	    switch (opcao) {
	        case 1:
	            valor = quantidade* 5;
	    }

	}

}
