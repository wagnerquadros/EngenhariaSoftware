package FistSteps;
import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    int idade, idadeEmDias;
	    
	    System.out.println("Qual a sua idade?");
	    idade = entrada.nextInt();
	    
	    idadeEmDias = 365*idade;
	    
	    System.out.print("Sua idade em dias é: " + idadeEmDias);
	    
	}

}
