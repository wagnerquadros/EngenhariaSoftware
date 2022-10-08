package Repeticao;

/*
Exercício 5. Faça um programa que leia três notas entre 0.0 e 10.0. Se a nota
informada pelo usuário for menor que 0 ou maior que 10, o programa deve
solicitar que o usuário informe uma nova nota até que esta seja válida. Quando as
três notas forem válidas, o programa deve calcular a média ponderada segundo a
fórmula: media = (2n1 + 3n2 + 5n3)/10 e mostrá-la ao usuário
*/

import java.util.Scanner;

public class Medias {
	
	public static void main(String[] args) {
		float notaUm, notaDois, notaTres, media;
		Scanner entrada = new Scanner(System.in);
		

		do {
		   System.out.print("Digite a nota 1: ");
		   notaUm = entrada.nextFloat();
		   if (notaUm<0 || notaUm >10){
		        System.out.println("Nota inválida. Boca'berta");
		   }
		} while (notaUm<0 || notaUm >10);
		do {
		   System.out.print("Digite a nota 2: ");
		   notaDois = entrada.nextFloat();
		   if (notaUm<0 || notaUm >10){
		        System.out.println("Nota inválida. Boca'berta");
		   }
		} while (notaDois<0 || notaDois >10);
		do {
		   System.out.print("Digite a nota 3: ");
		   notaTres = entrada.nextFloat(); 
		   if (notaUm<0 || notaUm >10){
		        System.out.println("Nota inválida. Boca'berta");
		   }
		} while (notaTres<0 || notaTres >10);
	    
	    media = ((2*notaUm)+(3*notaDois)+(5*notaTres))/10;
	    System.out.println("Media: " + media);
	}

}
