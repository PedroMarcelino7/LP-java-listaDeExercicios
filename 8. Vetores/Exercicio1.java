public class Exercicio1 {
	
	public static void main (String[] args) {
		int[] A = new int[15];
		
		for(int i = 0; i < 15; i++){
			A[i] = (int)(Math.random()*100);
		}
		
		for(int i = 0; i < 15; i++){
			System.out.println(A[i]);
		}
	}
}

