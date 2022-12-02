import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o tamanho de C: ");
		int N = scan.nextInt();
		
		do{
			if(N > 20 || N < 0){
				System.out.println("\nO valor deve estar entre 0 e 20");
				System.out.print("Insira o tamanho de C: ");
				N = scan.nextInt();
			}
			
		}while(N > 20 || N < 0);
		
		int[] C = new int[N];
				
		System.out.println("\n");
				
		for(int i = 0; i < N; i++){
			System.out.print("Insira algum valor: ");
			C[i] = scan.nextInt();
		}
		
		System.out.println("\n");
				
		for(int i = 0; i < N; i++){
			System.out.println(C[i]);
		}
	}
}

