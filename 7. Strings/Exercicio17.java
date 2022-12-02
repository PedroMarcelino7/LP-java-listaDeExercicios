import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int fraseMaior = 0, contagem = 0;

        System.out.print("Insira a primeira frase: ");
        String frase1 = scan.nextLine();

        System.out.print("Insira a segunda frase: ");
        String frase2 = scan.nextLine();

        if(frase1.length() > frase2.length()){
            fraseMaior = frase1.length();
            System.out.println("\nO tamanho das frases sao diferentes.");

        }else if(frase2.length() > frase1.length()){
            fraseMaior = frase2.length();
            System.out.println("\nO tamanho das frases sao diferentes.");
            
        }else{
            fraseMaior = frase1.length();
            System.out.println("\nO tamanho das frases sao iguais.");

            for(int i = 0; i < fraseMaior; i++){
                if(frase1.charAt(i) == frase2.charAt(i)){
                    contagem++;
                }
            }
        }

        if(contagem == fraseMaior){
            System.out.println("Todos os caracteres sao iguais.");
        }else{
            System.out.println("Os caracteres nao sao iguais.");
        }
        
    }
}
