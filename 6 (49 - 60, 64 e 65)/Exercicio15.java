import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2, soma = 0;

        System.out.print("Insira algum numero: ");
        numero1 = scan.nextInt();
    
        System.out.print("Insira outro numero: ");
            numero2 = scan.nextInt();
           
        if(numero1 > numero2){ //numero 1 maior
            System.out.println("Numero 1 maior que numero 2");

            for(int i = 0; numero1 >= numero2; numero1--){
                soma += numero1;
                System.out.println(numero1);
            }

        }else if(numero2 > numero1){ //numero 2 maior
            System.out.println("Numero 2 maior que numero 1");

            for(int i = 0; numero2 >= numero1; numero2--){
                soma += numero2;
                System.out.println(numero2);
            }

        }else{ //numeros iguais
            System.out.println("Os valores sao iguais");

            soma = (numero1 + numero2);
        }

        System.out.println("Soma total: " + soma);
    }
}
