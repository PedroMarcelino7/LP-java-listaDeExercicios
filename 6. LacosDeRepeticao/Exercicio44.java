import java.util.Scanner;

public class Exercicio44 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor = 0, aux = 1;
		
		System.out.print("Insira algum valor: ");
		valor = scan.nextInt();
		
		for (int i = 1; i <= valor; i++)
		{
			aux = aux * i;
			
			System.out.println(aux);
			
		}
		
		
		
	}
}

