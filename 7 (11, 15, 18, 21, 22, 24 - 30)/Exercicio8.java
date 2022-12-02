import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 97; i < 122; i++){
            for(int j = 0; j < frase.length(); j++){
                if(frase.charAt(j) == (char)i){
                    count++;
                }
            }
            if(count != 0){
                System.out.println((char)i + " = " + count);

                count = 0;
            }
        }
    }
}
