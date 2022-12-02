public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        int[] P = new int[10];
        for(int i = 0; i < 10; i++){
            P[i] = (int)(Math.random()*100);

            System.out.println("P[" + i + "]: " + P[i]);
        }

        System.out.print("\n");

        int[] Q = new int[15];
        for(int i = 0; i < 15; i++){
            Q[i] = (int)(Math.random()*100);

            System.out.println("Q[" + i + "]: " + Q[i]);
        }

        int[] R = new int[25];
        for(int i = 0; i < 25; i++){
            if(i < 15){
                R[i] = Q[i];
            }else{
                R[i] = P[i - 15];
            }
        }

        System.out.print("\n");

        for(int i = 0; i < 25; i++){
            System.out.println("R[" + i + "]: " + R[i]);
        }
    }
}
