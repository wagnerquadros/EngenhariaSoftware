package Vetores;


/******************************************************************************

Exercício 13. Em um concurso público inscreveram-se 10 candidatos para 3 vagas.
Cada candidato fez 3 provas, tendo cada uma pesos 2, 3 e 5 respectivamente.
Escreva um programa Java que leia o nome, matrícula e os pontos obtidos pelos
candidatos em cada prova; apresentar a classificação, a matrícula e o nome dos
candidatos aprovados, ordenados pela classificação

*******************************************************************************/
import java.util.Scanner;

public class Candidatos
{
	public static void main(String[] args) {
		
		String [] candidato = new String[10];
		int [] matricula = new int[10];
		double [] provaUm = new double[10];
		double [] provaDois = new double [10];
		double [] provaTres = new double [10];
		double [] resultado = new double [10];
		int contador=1, cambioMat;
		double resultadoFinal, best, cambioRF;
		String cambioNome;
		
		Scanner entrada = new Scanner(System.in);
	
		for (int i=0;i<10;i++){
		    
		    
		    System.out.print("Digite o nome do candidato " + contador + ": ");
		    candidato[i] = entrada.nextLine();
		
		    System.out.print("Digite a matricula do candidato " + contador + ": ");
		    matricula[i] = entrada.nextInt();
		    entrada.nextLine();
		    
		    System.out.print("Digite o resutado da prova 01 do candidato " + contador + ": ");
		    provaUm[i] = entrada.nextDouble();
		    entrada.nextLine();
		    
		    System.out.print("Digite o resutado da prova 02 do candidato " + contador + ": ");
		    provaDois[i] = entrada.nextDouble();
		    entrada.nextLine();
		    
		    System.out.print("Digite o resutado da prova 03 do candidato " + contador + ": ");
		    provaTres[i] = entrada.nextDouble();
		    entrada.nextLine();
		    
		    contador++;
		    
		    resultadoFinal = (provaUm[i]*0.2 + provaDois[i]*0.3 + provaTres[i]*0.5);
		    resultado[i]=resultadoFinal;
		    
		    
		}
		
		for (int i=0;i<10-1;i++){
		    for(int x=i+1;x<10;x++){
		        if(resultado[i]<resultado[x]){
                    cambioRF = resultado[i];
                    resultado[i] = resultado[x];
                    resultado[x] = cambioRF;
                    
                    cambioNome = candidato[i];
                    candidato[i] = candidato[x];
                    candidato[x] = cambioNome;
                    
                    cambioMat = matricula[i];
                    matricula[i] = matricula[x];
                    matricula[x] = cambioMat;
		        }
		        
		    }  
		 
		}

        contador=1;
        for (int i=0;i<10;i++){
            System.out.println(contador + ". " + candidato[i] + "  matricula: " + matricula[i] + "  Nota Final: " + resultado[i]);
            contador++;
            
        }
        
        
	}
}