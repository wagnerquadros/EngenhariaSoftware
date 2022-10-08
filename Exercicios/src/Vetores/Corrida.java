package Vetores;

/******************************************************************************
Exercício 12. Durante uma corrida de automóveis com N voltas de duração foram
anotadas para um piloto, na ordem sequencial, os tempos registrados em cada
volta. Faça um programa para ler os tempos registrados em 15 voltas, calcular e
imprimir:
A. Melhor tempo registrado;
B. A volta em que o melhor tempo ocorreu;
C. Tempo médio das N voltas;

*******************************************************************************/
import java.util.Scanner;

public class Corrida {
	
		public static void main(String[] args) {
		
		double [] vetor = new double[15];
		int contador=1, volta=0;
		double melhorTempo = 0, soma=0, media;
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		for (int i=0;i<15;i++){
		    
		    System.out.print("Digite o tempo da volta " + contador + ": ");
		    vetor[i] = entrada.nextDouble();
		    contador++;
		    
		    soma+=vetor[i];
		    
		    if(i==0 || vetor[i]<melhorTempo){
		        melhorTempo = vetor[i];
		        volta=i+1;
		    }
		    
		}
		
		media = soma / 15;
		
		System.out.println("Melhor tempo: " + melhorTempo);
		System.out.println("Volta: " + volta);
		System.out.println("Média: " + media);

	}
}