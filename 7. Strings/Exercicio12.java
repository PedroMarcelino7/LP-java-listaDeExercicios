import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int contagemA = 0, contagemE = 0, contagemI = 0, contagemO = 0, contagemU = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'A' || frase.charAt(i) == 'a'){
                contagemA++;
            }else if(frase.charAt(i) == 'E' || frase.charAt(i) == 'e'){
                contagemE++;
            }else if(frase.charAt(i) == 'I' || frase.charAt(i) == 'i'){
                contagemI++;
            }else if(frase.charAt(i) == 'O' || frase.charAt(i) == 'o'){
                contagemO++;
            }else if(frase.charAt(i) == 'U' || frase.charAt(i) == 'u'){
                contagemU++;
            }
        }

        System.out.println("Contagem A: " + contagemA + "\nContagem E: " + contagemE + "\nContagem I: " + contagemI + "\nContagem O: " + contagemO + "\nContagem U: " + contagemU);
    }
}
