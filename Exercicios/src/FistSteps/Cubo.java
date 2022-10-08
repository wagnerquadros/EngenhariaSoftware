package FistSteps;
import java.util.Scanner;

public class Cubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float comprimento;
		double volume;
		
		System.out.print("Informe o comprimento do lado do cubo:");
		comprimento = entrada.nextFloat();
		
		volume = Math.pow(comprimento,3);
		
		System.out.println(volume);
	}

}
