import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira alguma frase: ");
        String nome = scan.nextLine();

        String[] split = nome.split(" ");

        String sobrenome = split[split.length - 1];

        System.out.println(sobrenome);
    }
}
