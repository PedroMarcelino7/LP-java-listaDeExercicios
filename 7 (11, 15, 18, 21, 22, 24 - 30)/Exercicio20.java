import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        String[] palavras = frase.split(" ");
		int contagem = palavras.length;
        
		System.out.println(contagem);
    }
}
