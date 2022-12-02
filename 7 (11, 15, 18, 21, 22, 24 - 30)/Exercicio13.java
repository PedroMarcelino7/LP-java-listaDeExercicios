import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int contagemConsoante = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != 'A' && frase.charAt(i) != 'a' && frase.charAt(i) != 'E' && frase.charAt(i) != 'e' && frase.charAt(i) != 'I' && frase.charAt(i) != 'i' && frase.charAt(i) != 'O' && frase.charAt(i) != 'o' && frase.charAt(i) != 'U' && frase.charAt(i) != 'u'){
                if((frase.charAt(i) >= 'B' && frase.charAt(i) <= 'Z') || (frase.charAt(i) >= 'b' && frase.charAt(i) <= 'z')){
                    contagemConsoante++;
                }
            }
        }

        System.out.println("Contagem de consoante: " + contagemConsoante);
    }
}

