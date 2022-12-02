import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double total = 0;

        System.out.println("Quantas maçãs deseja comprar?");
        System.out.print("--> ");
        int maças = scan.nextInt();

        if(maças >= 12){
            total = (maças*1.00);
            System.out.println("Total de maçãs: " + maças);
            System.out.println("Valor da compra: R$" + total);

        }else if(maças < 12 && maças >=0){
            total = (maças*1.30);
            System.out.println("Total de maçãs: " + maças);
            System.out.println("Valor da compra: R$" + total);

        }else{
            System.out.println("VALOR INVALIDO");

        }
        
    }
}
