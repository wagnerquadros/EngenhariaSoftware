package Repeticao;
import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		int numeroDia;
		
		System.out.print("Digite um numero de  1 a 7: ");
		numeroDia = entrada.nextInt();
		
		switch (numeroDia){
		    case 1: 
		        System.out.println("Domingo");
		        break;
		    case 2:
		        System.out.println("Segunda");
		        break;
		    case 3:
		        System.out.println("Terça");
		        break;
		    case 4:
		        System.out.println("Quarta");
		        break;
		    case 5:
		        System.out.println("Quinta");
		        break;
		    case 6:
		        System.out.println("Sexta");
		        break;
		    case 7:
		        System.out.println("Sabado");
		        break;
		    default:
		        System.out.println("Inválido");
		        break;
		
		}
	
	}
}
