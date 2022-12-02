	import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor;
		
		do{
			System.out.print("Insira algum valor: ");
			valor = scan.nextInt();
			
			if(valor < 1 || valor > 10){
				System.out.println("O valor deve ser maior que 0 e maior que 10");
			}else{
				for(int i = 1; i <= 10; i++){
				System.out.println(i + " * " + valor + " = " + (i * valor));
				}
			}
			
		}while(valor < 1 || valor > 10);
	}           
}               
			    
