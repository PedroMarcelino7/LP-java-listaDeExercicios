import javax.lang.model.element.ExecutableElement;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int contagem = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                contagem++;
            }
        }

        System.out.println("Quantidade de espaços: " + contagem);
    }
}
