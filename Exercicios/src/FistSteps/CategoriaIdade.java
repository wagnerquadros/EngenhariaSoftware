package FistSteps;
import java.util.Scanner;

public class CategoriaIdade {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <= 14) {
		    System.out.println("Infantil");
		} else if (idade >= 15 && idade <= 17) {
		    System.out.println("Garotinho Juvenil");
		} else if (idade >=18 && idade <= 25) {
		    System.out.println("Adultão");
		} else {
		    System.out.println("Inválido");
		}
	}

}
