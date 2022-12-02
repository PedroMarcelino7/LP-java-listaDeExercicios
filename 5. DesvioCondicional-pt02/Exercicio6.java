import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o 1º valor: ");
        int valor1 = scan.nextInt();

        System.out.print("Insira o 2º valor: ");
        int valor2 = scan.nextInt();

        if(valor1 == valor2){
            System.out.println("Os valores devem ser diferentes");
            System.out.print("insira um valor diferente de " + valor2 + ": ");
            int novoValor = scan.nextInt();

            if(valor1 > novoValor){
                System.out.println("O valor 1 (" + valor1 + ") é maior que o valor 2 (" + novoValor + ")");
            }else{
                System.out.println("O valor 2 (" + novoValor + ") é maior que o valor 1 (" + valor1 + ")");
            }

        }else{
            if(valor1 > valor2){
                System.out.println("O valor 1 (" + valor1 + ") é maior que o valor 2 (" + valor2 + ")");
            }else{
                System.out.println("O valor 2 (" + valor2 + ") é maior que o valor 1 (" + valor1 + ")");
            }
        }
    }
}
