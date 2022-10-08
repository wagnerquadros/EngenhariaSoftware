package Repeticao;

/*
Exercício 7. Fazer um programa que leia um número não conhecido de respostas
do time que torce: g – Gremio, i – Inter ou o - outros. O programa deve encerrar
quando for digitado f – Fim. Escrever ao final o total de torcedores entrevistados, a
quantidade de gremistas e a quantidade de colorados.
*/



import java.util.Scanner;

public class Torcidas {
	
	public static void main(String[] args) {
		char opcao;
		int gremio=0, inter=0, outro=0, soma;
	
		Scanner entrada = new Scanner(System.in);
		
		do {
		    System.out.println("====================");
		    System.out.println("  Torcida Alegre    ");
		    System.out.println("====================");
		    System.out.println("g - Gremio          ");
		    System.out.println("i - Inter           ");
		    System.out.println("o - Outros          ");
		    System.out.println("f - sair            ");
		    System.out.println("====================");
		    System.out.print("Qual o seu time: ");
		    opcao = entrada.next().charAt(0);
		    switch(opcao){
		        case 'G': case 'g':
		            gremio++;
		            break;
		        case 'I': case 'i':
		            inter++;
		            break;
		        case 'O': case 'o':
		            outro++;
		            break;
		        case 'F': case 'f':
		            break;
                default:
                    System.out.println("Opção inválida.");
                    break;
		            
		    }
		} while (opcao!='F' && opcao!='f');
		soma = gremio+inter+outro;
		
		System.out.println("Total: " + soma);
		System.out.println("Gremistas: " + gremio);
		System.out.println("Colorados: " + inter);
	    System.out.println("Pessoas estrangeiras: " + outro);
	}
}