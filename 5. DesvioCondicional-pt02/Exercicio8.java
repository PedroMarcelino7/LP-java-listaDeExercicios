import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempoTotal;
		
		System.out.print("Insira a hora de inicio: ");
		int inicio = scan.nextInt();
		
		System.out.print("Insira a hora final: ");
		int fim = scan.nextInt();
		
		if (fim < inicio){
			tempoTotal = ((24 - inicio) + fim);
			
			System.out.println("O tempo de duracao da partida e de: " + tempoTotal);
		}else if (fim > inicio){
			tempoTotal = (fim - inicio);
			
			System.out.println("O tempo de duracao da partida e de: " + tempoTotal);
		}else{
			System.out.println("A duracao da partida e menor que 1 hora.");
		}
	}
}

