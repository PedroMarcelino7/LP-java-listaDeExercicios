import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int dentro = 0, fora = 0;
		int valores[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Insira algum numero: ");
			valores[i] = scan.nextInt();
			
			if(valores[i] >= 10 && valores[i] <= 20){
				dentro++;
			}else{
				fora++;
			}	
		}
		
		System.out.println("A quantidade de numeros dentro do intervalo e: " + dentro + " e a quantidade de numeros fora do intervalo e: " + fora);
	}
}

