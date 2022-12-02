public class Exercicio11 {
    public static void main(String[] args) throws Exception {
        int[] QA = new int[5];
        int[] QB = new int[5];
        int[] QC = new int[10];

        int auxA = 0;
        int auxB = 0;

        for(int i = 0; i < 5; i++){
            QA[i] = (int)(Math.random()*100);
            QB[i] = (int)(Math.random()*100);

            //System.out.println("A: " + QA[i] + "\nB: " + QB[i]);
        }

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                QC[i] = QA[auxA];
                auxA++;
            }else{
                QC[i] = QB[auxB];
                auxB++;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println("QC[" + i + "]: " + QC[i]);
        }
    }
}
