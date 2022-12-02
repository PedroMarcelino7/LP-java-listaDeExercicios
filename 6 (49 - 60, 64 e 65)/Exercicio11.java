import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] notas = new int[10];
		int somaNotas = 0, media = 0;
		
		System.out.print("Insira a quantidade de alunos: ");
		int alunos = scan.nextInt();
		
		for(int i = 0; i < alunos; i++){
			System.out.print("Insira a nota dos alunos: ");
			notas[i] = scan.nextInt();
			
			somaNotas += notas[i];
			media = (somaNotas / alunos);
		}
		
		System.out.println("A media aritmetica das notas dos alunos e: " + media);
	}
}

