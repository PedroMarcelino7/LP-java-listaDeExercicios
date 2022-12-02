import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        char a = 'a', A = 'A';
        int contagem = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == a || frase.charAt(i) == A){
                contagem++;
            }
        }

        System.out.println(contagem);
    }
}
