import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int contagem = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
                contagem++;
            }
        }

        System.out.println("Quantidade upper: " + contagem);
    }
}
