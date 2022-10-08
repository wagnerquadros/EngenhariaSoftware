package FistSteps;
import java.util.Scanner;

public class Cotacao {
	
	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		double valorReais, valorEuros;
		
		System.out.println("=============================");
		System.out.println("===  Cotação On de line  ====");
		System.out.println("=============================");
		
		System.out.print("Me diz aí quanto tu tem de dinheiro: ");
		valorReais = entrada.nextFloat();
		valorEuros = valorReais * 0.19;
		
		System.out.println("===========================");
		System.out.println("eeeeee  u    u  rrrr  ooooo");
		System.out.println("e       u    u  r  r  o   o");
		System.out.println("eee     u    u  rr    o   o");
		System.out.println("e       u    u  r r   o   o");
		System.out.println("eeeeee  uuuuuu  r  r  ooooo");
		System.out.println("===========================");
		System.out.println("Chê, na Europa tu vai passar fome: EU " + valorEuros);
		
		
	}

}
