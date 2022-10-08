package Repeticao;

/*
Exercício 6. Escreva um programa que apresente quatro opções: (a) consulta
saldo, (b) saque e (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada
saque ou depósito o valor do saldo deve ser atualizado
*/

import java.util.Scanner;

public class BancAlegria {
	
	public static void main(String[] args) {
		char opcao;
		int sair;
		float saldo, valorSaque, deposito;
		Scanner entrada = new Scanner(System.in);
		
		saldo = 0;
		sair = 0;
		
		do {
		    System.out.println("====================");
		    System.out.println("     BancAlegria    ");
		    System.out.println("====================");
		    System.out.println("a - Concultar saldo ");
		    System.out.println("b - saque           ");
		    System.out.println("c - deposito        ");
		    System.out.println("d - sair            ");
		    System.out.println("====================");
		    System.out.print("O que deseja fazer: ");
		    opcao = entrada.next().charAt(0);
		    switch(opcao){
		        case 'A': case 'a':
		            System.out.println("Sou saldo é: R$" + saldo);
		            break;
		        case 'B': case 'b':
		            System.out.print("Quanto deseja sacar: ");
		            valorSaque = entrada.nextFloat();
		            if (valorSaque>saldo || valorSaque < 0){
		                System.out.println("Saldo insuficiente. Simule um emprestimo em nosso app");
		            } else {
		                saldo = saldo - valorSaque;
		            }
		            break;
		        case 'C': case 'c':
		            System.out.print("Qual o valor do depósito: ");
		            deposito = entrada.nextFloat();
		            if (deposito > 0){
		                saldo = saldo + deposito;
		            } else {
		                System.out.println("Valor inválido");
		            }
		            break;
                case 'D': case 'd':
                    sair = 1;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
		            
		    }
		} while (sair!=1);
	}
}