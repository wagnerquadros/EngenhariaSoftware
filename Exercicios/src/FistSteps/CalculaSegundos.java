package FistSteps;
import java.util.Scanner;

public class CalculaSegundos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int hora, minuto,segundo;
		
		System.out.println("Digite a hora e os munitos:");
		hora = entrada.nextInt();
		minuto = entrada.nextInt();
		
		if (hora < 0 || hora > 23) {
		    System.out.println ("Hora incorreta");
		} 
		
		if (minuto < 0 || minuto > 59) {
		    System.out.println("Minutos incorretos");
		}
	
        if (hora >= 0 && hora <=23){
            if (minuto >=0 && minuto <=59) {
                segundo = (hora * 3600) + (minuto * 60);
                System.out.println("Quantidade de segundos:" + segundo);
            }
        }	
	}

}
