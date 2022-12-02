import java.util.Scanner;

public class VerificaValorProduto {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o preço do 1º produto: ");
        int precoProduto1 = scan.nextInt();

        if(precoProduto1 >= 0 && precoProduto1 <= 1000){
            System.out.print("Insira o preço do 2º produto: ");
            int precoProduto2 = scan.nextInt();

            if(precoProduto2 >= 0 && precoProduto2 <= 1000){
                if(precoProduto1 < precoProduto2){
                    System.out.println("O produto 1 é mais barato");

                }else if(precoProduto1 > precoProduto2){
                    System.out.println("O produto 2 é mais barato");

                }else{
                    System.out.println("Os produtos possuem o mesmo preço");

                }
            }else{
                System.out.println("VALOR INVALIDO");

            }
        }
        else{
            System.out.println("VALOR INVALIDO");
            
        }
    }
}
