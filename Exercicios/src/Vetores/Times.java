package Vetores;

/******************************************************************************
Exercício 11. Num torneio de futsal, rodada SIMPLES, inscreveram-se 5 times.
Escreva um programa Java que leia o nome dos times, armazena-os em um vetor e
imprime a tabela de jogos.
Exemplo de vetor: CAXIAS, GRÊMIO, INTER, JUVENTUDE, PELOTAS

Resposta:
CAXIAS X GRÊMIO
CAXIAS X INTER
CAXIAS X JUVENTUDE
CAXIAS X PELOTAS
GRÊMIO X INTER
GRÊMIO X JUVENTUDE
GRÊMIO X PELOTAS
INTER X JUVENTUDE
INTER X PELOTAS
JUVENTUDE X PELOTAS


*******************************************************************************/
import java.util.Scanner;

public class Times
{
	public static void main(String[] args) {
		
		String [] vetor = new String[5];

		
		Scanner entrada = new Scanner(System.in);
		

		for (int i=0;i<5;i++){
		    System.out.print("Digite o " + i +"° time: ");
		    vetor[i] = entrada.nextLine();
	
		}

        for (int i=0;i<5;i++){
            for(int x=0;x<5;x++){
                if(x!=i && x<i) {
         
                    System.out.println(vetor [i] + " X " + vetor[x]);
                }
                
            }
        }
	    
	}
}