import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[100];
        int numeroMaior = Integer.MIN_VALUE, numeroMenor = Integer.MAX_VALUE, auxiliarMenor = -1, auxiliarMaior = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Insira algum valor: ");
            valores[i] = scan.nextInt();

            if(valores[i] > numeroMaior){
                numeroMaior = valores[i];
                auxiliarMaior = i;
            }

            if(valores[i] < numeroMenor){
                numeroMenor = valores[i];
                auxiliarMenor = i;
            }
        }

        System.out.println("Maior numero: " + numeroMaior);
        System.out.println("Menor numero: " + numeroMenor);
    }
}
