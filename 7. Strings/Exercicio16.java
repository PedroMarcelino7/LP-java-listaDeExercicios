import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int contagem = 0;

        System.out.print("Insira alguma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == frase.toUpperCase().charAt(i)){
                contagem++;
            }
        }

        if(frase.length() == contagem){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
       
    }
}
