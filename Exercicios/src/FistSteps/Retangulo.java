package FistSteps;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float base, altura, area, perimetro;
		
		System.out.print("Digite a altura do retangulo:");
		altura = entrada.nextFloat();
		
		System.out.print("Digite a base do retangulo:");
		base = entrada.nextFloat();
		
		area = base * altura;
		perimetro = (base*2) + (altura*2);
		
		System.out.print("A área desse teu triângulo é " + area +", e o perímetro  é " + perimetro);

		
	}
}
