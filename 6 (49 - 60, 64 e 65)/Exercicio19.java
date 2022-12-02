import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int quantidade = 0,soma = 0;
        char opcao = 'S';
        //int[] valores = new int[x];

        do{
            System.out.print("Insira o valor da mercadoria: ");
            int valor = scan.nextInt();

            soma += valor;
            quantidade++;

            System.out.println("Mais mercadorias (S/N) ?");
            System.out.print("--> ");
            opcao = scan.next().charAt(0);

        }while(opcao == 'S');

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma / quantidade));
    }
}
