import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira algum valor: ");
        int valor = scan.nextInt();

        if(valor > 10){
            System.out.print("É MAIOR QUE 10");
        }else{
            System.out.print("NÃO É MAIOR QUE 10");
        }
    }
}
