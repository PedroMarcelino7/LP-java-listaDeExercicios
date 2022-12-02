import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o valor de N: ");
		int N = scan.nextInt();
		
		do{
			if(N > 20 || N <= 0){
				System.out.println("\nO valor deve ser entre 0 e 20");
				System.out.print("Insira outro valor para N: ");
				N = scan.nextInt();	
			}
		}while(N > 20 || N <= 0);
		
		int[] E = new int[N];
		
		System.out.print("\n");
		
		for(int i = 0; i < N; i++){
			E[i] = (int)(Math.random()*100);
			
			System.out.println(E[i]);
		}
		
		int maior = E[0];
		
		for(int i = 0; i < N; i++){
			if(E[i] > maior){
				maior = E[i];
			}
		}
		
		System.out.println("\nO maior valor e: " + maior);
	}
}

