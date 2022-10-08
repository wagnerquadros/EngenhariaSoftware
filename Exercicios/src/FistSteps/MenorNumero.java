package FistSteps;
import java.util.Scanner;

public class MenorNumero {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, terceiroNumero;
		
		System.out.println("Digite 3 numeros, um por vez:");
		primeiroNumero = entrada.nextInt();
		segundoNumero = entrada.nextInt();
		terceiroNumero = entrada.nextInt();
		
		if (primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
		    System.out.println("Os números são iguais");
		} else {
		    if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
		        System.out.println("O menor numero é: " + primeiroNumero); 
		    } else {
		        if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
		            System.out.println ("O menor numero é: " + segundoNumero);
		        } else { 
		            System.out.println ("o menor numero é: " + terceiroNumero);
		        }  
		    }
		}
	}
	

}
