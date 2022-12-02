public class Exercicio9 {
	
	public static void main (String[] args) {
		int[] G = new int[5];
		
		int count = 0;
		
		for(int i = 0; i < 5; i++){
			G[i] = (int)(Math.random()*100);
			
			System.out.println(G[i]);
			
			if(G[i] % 2 == 0){
				count++;
			}
		}
		
		if(count == 0){
			System.out.println("O vetor G nao possui elementos pares");
		}else{
			int[] H = new int[count];
			
			for(int i = 0, auxiliar = 0; i < 5; i++){
				if(G[i] % 2 == 0){
					H[auxiliar++] = G[i];
				}
			}
			
			for(int j = 0; j < count; j++){
				System.out.println("H: " + H[j]);
			}
		}
	}
}

