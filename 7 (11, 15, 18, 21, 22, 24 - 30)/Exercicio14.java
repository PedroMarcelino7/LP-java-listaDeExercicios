import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        System.out.print("\nInsira algum caracter: ");
        char caracter = scan.next().charAt(0);

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == caracter){
                frase = frase.replace(caracter, '*');
            }
        }

        System.out.println("\nFrase final: " + frase);
    }
}
