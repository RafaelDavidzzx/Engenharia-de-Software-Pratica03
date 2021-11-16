package Teste;
import java.util.Scanner;

public class rafaelDavid {
 
	public static void main (String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int A = input.nextInt();
			int B = input.nextInt();
			int SOMA = A+B;
			
			System.out.println("SOMA" +SOMA);
			
			input.close();
		}
	}
	
	
}
