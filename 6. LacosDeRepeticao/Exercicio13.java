import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner scan =  new Scanner(System.in);

        int[] numeros = new int[10];
        int somaMaior40 = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Insira algum numero: ");
            numeros[i] = scan.nextInt();

            if(numeros[i] > 40){
                somaMaior40 += numeros[i];
            }
        }

        System.out.println("A soma dos numeros maiores que 40 é: " + somaMaior40);
    }
}
