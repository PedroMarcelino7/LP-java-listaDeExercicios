import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int nota1,nota2,media = 0;
        char opcao = 'S';

        do{
            do{
                System.out.print("Insira a primeira nota: ");
                nota1 = scan.nextInt();
    
            }while(nota1 > 10 || nota1 < 0);
    
            do{
                System.out.print("Insira a segunda nota: ");
                nota2 = scan.nextInt();
    
            }while(nota2 > 10 || nota2 < 0);
            
            media = ((nota1 + nota2)/2);
    
            System.out.println("Media: " + media);

            System.out.println("NOVO CALCULO (S/N)?");
            System.out.print("--> ");
            opcao = scan.next().charAt(0);

        }while(opcao == 'S');
        
    }
}
