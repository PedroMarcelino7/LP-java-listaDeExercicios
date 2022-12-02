import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int aux = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();
        
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != fraseInvertida.charAt(i)){
                aux++;
            }
        }

        if(aux > 0){
            System.out.println("\nNao e palindromo.");
        }else{
            System.out.println("\nE palindromo.");
        }

        System.out.println("\nFrase: " + frase + "\nFrase invertida: " + fraseInvertida);
    }
}
