import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira algum valor: ");
        int valor = scan.nextInt();

        if(valor >= 0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }
}
