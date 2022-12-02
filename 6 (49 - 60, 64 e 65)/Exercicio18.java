import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int valorTotal = 0, media = 0;
    
        System.out.print("Numero total de mercadorias em estoque: ");
        int estoque = scan.nextInt();

        int[] valor = new int[estoque];

        for(int i = 0; i < estoque; i++){
            System.out.print("Valor da " + (i + 1) + " mercadoria: ");
            valor[i] = scan.nextInt();

            valorTotal += valor[i];
            media = valorTotal/estoque;
        }
        
        System.out.println("O valor total em estoque e: " + valorTotal);
        System.out.println("A media de valores dos produtos e: " + media);
    }
}


