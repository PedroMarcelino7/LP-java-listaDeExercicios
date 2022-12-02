import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int auxMaior, auxMenor;

        System.out.print("Insira o valor de N: ");
        int N = scan.nextInt();

        do{
            if(N > 10 || N <= 0){
                System.out.println("O valor de N deve ser entre 1 e 10");
                System.out.print("Insira o valor de N: ");
                N = scan.nextInt();
            }
        }while(N > 10 || N <= 0);

        int[] P = new int[N];

        for(int i = 0; i < N; i++){
            P[i] = (int)(Math.random()*100);

            System.out.println("P[" + i + "]: " + P[i]);
        }

        System.out.print("\n");

        System.out.print("Insira o valor de M: ");
        int M = scan.nextInt();

        do{
            if(M > 15 || M <= 0){
                System.out.println("O valor de M deve ser entre 1 e 15");
                System.out.print("Insira o valor de M: ");
                M = scan.nextInt();
            }
        }while(M > 15 || M <= 0);

        int[] Q = new int[M];

        for(int i = 0; i < M; i++){
            Q[i] = (int)(Math.random()*100);

            System.out.println("Q[" + i + "]: " + Q[i]);
        }

        System.out.print("\n");

        int[] R = new int[N+M];

        if(M > N){
            for(int i = 0; i < (N+M); i++){
                if(i < M){
                    R[i] = Q[i];
                }else{
                    R[i] = P[i - M];
                }
            }

            for(int i = 0; i < (N+M); i++){
                System.out.println("R[" + i + "]: " + R[i]);
            }
            
        }else{
            for(int i = 0; i < (N+M); i++){
                if(i < N){
                    R[i] = P[i];
                }else{
                    R[i] = Q[i - N];
                }
            }

            for(int i = 0; i < (N+M); i++){
                System.out.println("R[" + i + "]: " + R[i]);
            }
        }

        
    }
}
