import java.util.Scanner;

public class Exercicio7 {
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
                System.out.println((novoValor) + " " + (valor1));
            }else{
                System.out.println((valor1) + " " + (novoValor));
            }

        }else{
            if(valor1 > valor2){
                System.out.println((valor2) + " " + (valor1));
            }else{
                System.out.println((valor1) + " " + (valor2));
            }
        }
    }
}
