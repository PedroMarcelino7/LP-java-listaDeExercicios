import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor;
		
		do{
			System.out.print("Insira algum valor: ");
			valor = scan.nextInt();
			
			if(valor <= 0){
				System.out.println("O valor deve ser maior que 0");
			}
			
			for(int i = 1; i <= valor; i++){
				System.out.println(i);
			}
			
		}while(valor <= 0);
	}
}

