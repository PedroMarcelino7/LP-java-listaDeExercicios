import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2, soma = 0;

        System.out.print("Insira algum numero: ");
        numero1 = scan.nextInt();
        
        do{
            System.out.print("Insira outro numero: ");
            numero2 = scan.nextInt();

        }while(numero2 < numero1);

        for(int i = 0; numero1 <= numero2; numero1++){
            soma += numero1;
            System.out.println(numero1);
        }

        System.out.println("Soma total: " + soma);
    }
}
