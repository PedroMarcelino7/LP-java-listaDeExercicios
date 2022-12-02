public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        int[] PA = new int[5];
        int[] PB = new int[5];
        int[] PC = new int[10];

        for(int i = 0; i < 5; i++){
            PA[i] = (int)(Math.random()*100);
            PB[i] = (int)(Math.random()*100);
        }

        for(int i = 0; i < 10; i++){
            if(i < 5){
                PC[i] = PA[i];
            }else if(i >= 5){
                PC[i] = PB[i - 5];
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println("PC[" + i + "]: " + PC[i]);
        }
    }
}
