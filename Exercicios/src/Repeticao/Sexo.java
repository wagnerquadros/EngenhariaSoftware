package Repeticao;
import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char sexo;
		
		System.out.print("Digite seu sexo: ");
		sexo = entrada.next().charAt(0);
		
		switch (sexo){
		    case 'M': case 'm': case 'g': case 'k': //case como se fosse 'ou' 
		        System.out.println("Maculino");
		        break;
		    case 'F': case 'f':
		        System.out.println("Feminino");
		        break;
		    default:
		        System.out.println("Letra Inválida");
		        break;
		
		}
	
	}
}
