import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int contagem = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        System.out.print("Insira o caracter de contagem: ");
        char caracter = scan.next().charAt(0);
        char caracterUpper = Character.toUpperCase(caracter);
        char caracterLower = Character.toLowerCase(caracter);

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == caracterUpper || frase.charAt(i) == caracterLower){
                contagem++;
            }
        }

        System.out.println(contagem);
    }
}
