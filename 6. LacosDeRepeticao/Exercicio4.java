import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira algum valor: ");
		int valor = scan.nextInt();
		
		if(valor > 0){
			for(int i = 1; i <= valor; i++){
				System.out.println(i);
			}
		}else{
			System.out.println("VALOR INVALIDO");
		}
	}
}

