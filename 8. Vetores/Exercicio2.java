public class Exercicio2 {
	
	public static void main (String[] args) {
		int[] B = new int[15];
		
		for(int i = 0; i < 15; i++){
			B[i] = (int)(Math.random()*100);
		}
		
		for(int i = 14; i >= 0; i--){
			System.out.println(B[i]);
		}
	}
}

