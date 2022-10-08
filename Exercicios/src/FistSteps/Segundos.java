package FistSteps;
import java.util.Scanner;

public class Segundos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int horas, minutos, segundos, restoHora, restoMinuto;
		
		System.out.print("Digita uma quantidade de segundos, qualquer coisa, o que vier na cabeça:");
		segundos = entrada.nextInt();
		
		horas = segundos/3600;
		restoHora = segundos % 3600;
		minutos = restoHora/60;
		restoMinuto = restoHora % 60;
		segundos = restoMinuto;
	    
	    
	    System.out.println("Em Brasilia são: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
	    System.out.println("Essa é a voz do Brasil!!!");
		   
		
	}
}
