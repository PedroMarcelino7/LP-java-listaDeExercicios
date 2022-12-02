import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int media = 0, somaNumeros = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Insira algum numero: ");
			numeros[i] = scan.nextInt();
			
			somaNumeros += numeros[i];
			media = somaNumeros/10;
		}
		
		System.out.println("A media dos numeros digitados e: " + media);
	}
}

