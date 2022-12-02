import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int idade = 0;

        System.out.print("Insira o ano atual: ");
        int anoAtual = scan.nextInt();

        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        idade = (anoAtual - anoNascimento);

        if(idade >= 16){
            System.out.println("PODE VOTAR");
        }else{
            System.out.println("NAO PODE VOTAR");
        }

        System.out.println("Idade: " + idade);
    }
}
