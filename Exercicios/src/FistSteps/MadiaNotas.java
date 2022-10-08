package FistSteps;
import java.util.Scanner;

public class MadiaNotas {
	
	public static void main(String[] args) {
		   
	    Scanner entrada = new Scanner(System.in);
	    
	    int numeroUm, numeroDois, notaUm, notaDois, notaTres, mediaNotas;
	    
		System.out.println("É o Grêmio penta campeão da copa do Brasil");
	
	    System.out.println("=================================================");
		
		System.out.print("Me digita um numero aí, chê: ");
		numeroUm = entrada.nextInt();
		System.out.print("Tá, agora tu digita outro numero: ");
		numeroDois = entrada.nextInt();
		System.out.println("A soma dos numeros é: " + (numeroUm + numeroDois));
		
		System.out.println("=================================================");
		
		System.out.println("Beleza! Agora te liga, tu vai digitar trÊs notas, uma de cada vez");
		System.out.print("Primeira nota:");
		notaUm = entrada.nextInt();
		System.out.print("Segunda nota:");
		notaDois = entrada.nextInt();
		System.out.print("Terceira nota:");
		notaTres = entrada.nextInt();
		
		mediaNotas = (notaUm + notaDois + notaTres)/3;
		
		System.out.println("A media da turma é:" + mediaNotas);
		
	}

}
