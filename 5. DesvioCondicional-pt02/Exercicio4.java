import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double media = 0;

        System.out.print("Insira a 1ª nota: ");
        int nota1 = scan.nextInt();

        System.out.print("Insira a 2ª nota: ");
        int nota2 = scan.nextInt();

        media = ((nota1 + nota2)/2);

        if(media >= 6){
            System.out.println("APROVADO");

        }else{
            System.out.println("REPROVADO");
        }

        System.out.println("Media: " + media);
        
    }
}
