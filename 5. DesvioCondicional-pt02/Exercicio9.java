import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		System.out.print("Insira o salario por horas trabalhadas: ");
		int salarioPorHoras = scan.nextInt();
		
		if(horasTrabalhadas > 40){
			int horasExtras = (horasTrabalhadas - 40);
			int salarioExtra = (horasExtras *(salarioPorHoras / 2));
			
			int salarioTotal = (40 * salarioPorHoras + salarioExtra);
			
			System.out.println("Salario Total: " + salarioTotal);
		}else{
			int salarioTotal = (horasTrabalhadas * salarioPorHoras);
			
			System.out.println("Salario Total: " + salarioTotal);
		}
		
	}
}

