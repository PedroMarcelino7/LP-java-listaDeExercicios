import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[10];
        int soma = 0;

        for(int i = 0; i < 10; i++){
            Scanner scan = new Scanner(System.in);

            System.out.print("Insira algum numero: ");
            numeros[i] = scan.nextInt();

            soma +=  numeros[i];
        }

        System.out.println("Soma: " + soma);
    }
}
