package Repeticao;

import java.util.Scanner;

public class Tabela {
	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		char opcao;
		
		System.out.println("===============================");
		System.out.println(" Opção      |   Ação           ");
		System.out.println("===============================");
		System.out.println("  a         |   Cadastrar      ");
		System.out.println("  b         |   Editar         ");
		System.out.println("  c         |   Consultar      ");
		System.out.println("  d         |   Remover        ");
		System.out.println("  e         |   Sair           ");
		System.out.println("===============================");
		System.out.print("Escolha uma opção: ");
		opcao = entrada.next().charAt(0);
		
		switch (opcao) {
		    case 'A': case 'a':
		        System.out.println ("Cadastrar");
		        break;
		    case 'B': case 'b':
		        System.out.println("Editar");
		        break;
		    case 'C': case 'c': 
		        System.out.println("Consultar");
		        break;
		    case 'D': case 'd':
		        System.out.println("Remover");
		        break;
		    case 'E': case 'e':
		        System.out.println("Sair");
		        break;
		    default:
		        System.out.println("Código Invalido");
		        break;
		}

	}

}
