public class Exercicio8 {
	
	public static void main (String[] args) {
		int[] F = new int[5];
		
		int soma = 0;
		
		for(int i = 0; i < 5; i++){
			F[i] = (int)(Math.random()*100);
			
			System.out.println(F[i]);
		}
		
		for(int i = 0; i < 5; i++){
			if(F[i] % 2 != 0){
				soma += F[i];
			}
		}
		
		System.out.println("\nSoma: " + soma);
	}
}

