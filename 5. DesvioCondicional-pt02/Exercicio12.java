import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String procedencia;
        double frete,total;

        System.out.print("Insira o preco do produto: ");
        double precoProduto = scan.nextInt();

        System.out.print("Insira o codigo de origem: ");
        int codigoDeOrigem = scan.nextInt();

        if(codigoDeOrigem == 1){
            procedencia = "norte";

            frete = (precoProduto * (0.1));
            total = (precoProduto + frete);

            System.out.println("Preco: " + precoProduto);
            System.out.println("Procedencia: " + procedencia);
            System.out.println("Frete: " + frete + " (10%)");
            System.out.println("Valor final: " + total);

        }else if(codigoDeOrigem == 2 || codigoDeOrigem == 5 || codigoDeOrigem == 9){
            procedencia = "sul";

            frete = (precoProduto * (0.03));
            total = (precoProduto + frete);

            System.out.println("Preco: " + precoProduto);
            System.out.println("Procedencia: " + procedencia);
            System.out.println("Frete: " + frete + " (3%)");
            System.out.println("Valor final: " + total);

        }else if(codigoDeOrigem == 3 || (codigoDeOrigem >=10 && codigoDeOrigem <= 15)){
            procedencia = "leste";
            
            frete = (precoProduto * (0.012));
            total = (precoProduto + frete);

            System.out.println("Preco: " + precoProduto);
            System.out.println("Procedencia: " + procedencia);
            System.out.println("Frete: " + frete + " (1.2%)");
            System.out.println("Valor final: " + total);

        }else if(codigoDeOrigem == 7 || codigoDeOrigem == 20){
            procedencia = "oeste";
            
            frete = (precoProduto * (0.073));
            total = (precoProduto + frete);

            System.out.println("Preco: " + precoProduto);
            System.out.println("Procedencia: " + procedencia);
            System.out.println("Frete: " + frete + " (7.3%)");
            System.out.println("Valor final: " + total);

        }else{
            procedencia = "importado";
            
            frete = (precoProduto * (0.222));
            total = (precoProduto + frete);

            System.out.println("Preco: " + precoProduto);
            System.out.println("Procedencia: " + procedencia);
            System.out.println("Frete: " + frete + " (22.2%)");
            System.out.println("Valor final: " + total);

        }
    }
}
