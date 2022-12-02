import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
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
		int[] somaArrays = new int[N];
		
		for(int i = 0; i < N; i++){
			array1[i] = (int)(Math.random()*100);
			
			array2[i] = (int)(Math.random()*100);
		
			somaArrays[i] = array1[i] + array2[i];
		}
		
		System.out.println("\nTerceiro vetor: ");
		System.out.println("A1 - A2 - A3\n");
		for(int i = 0; i < N; i++){
			System.out.println(array1[i] + " - " + array2[i] + " - " + somaArrays[i]);
		}
	}
}

