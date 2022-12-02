import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("Insira o valor de N: ");
		int N = scan.nextInt();
		
		do{
			if(N > 15 || N <= 0){
				System.out.println("\nO valor deve ser entre 0 e 15");
				System.out.print("Insira outro valor para N: ");
				N = scan.nextInt();	
			}
		}while(N > 15 || N <= 0);
		
		int[] array1 = new int[N];
		int[] array2 = new int[N];
		
		for(int i = 0; i < N; i++){
			array1[i] = (int)(Math.random()*25);
			array2[i] = (int)(Math.random()*25);
			
			System.out.println((i+1) + ": " + array1[i] + " " + array2[i]);
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < N; i++){
			if(array1[i] == array2[i]){
				System.out.println("Os arrays sao iguais na posicao " + (i+1));
				count++;
			}
		}
		
		if(count == 0){
			System.out.println("\nOs arrays nao sao iguais em nenhuma posicao");
		}
	}
}

