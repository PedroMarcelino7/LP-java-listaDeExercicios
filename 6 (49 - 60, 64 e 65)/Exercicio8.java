import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int valores[] = new int[10]; 
		int negativo = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Insira algum numero: ");
			valores[i] = scan.nextInt();
			
			if(valores[i] < 0){
				negativo++;
			}
		}
		
		System.out.println(negativo);
	}
}

