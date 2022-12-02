import java.util.Scanner;import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int resultado = 0;

        //Ler valores
        System.out.print("insira algum valor: ");
        int valor1 = scan.nextInt();

        System.out.print("insira outro valor: ");
        int valor2 = scan.nextInt();

        //Ler escolha de operação
        String operacoes = new String("+/-*");
        System.out.println("Digite o simbolo referente a operacao que deseja efetuar");
        System.out.println("Soma: +\nSubtracao: -\nMultiplicacaao: *\nDivisao: /");
        System.out.print("--> ");
        char escolha = scan.next().charAt(0);

        if(escolha == '+'){
            resultado = (valor1 + valor2);
            System.out.println("A opcao escolhida foi: SOMA");
            System.out.println("O valor da soma dos numeros " + valor1 + " e " + valor2 + " é: " + resultado);
        }else if(escolha == '-'){
            resultado = (valor1 - valor2);
            System.out.println("A opcao escolhida foi: SUBTRACAO");
            System.out.println("O valor da subtracao dos numeros " + valor1 + " e " + valor2 + " é: " + resultado);
        }else if(escolha == '*'){
            resultado = (valor1 * valor2);
            System.out.println("A opcao escolhida foi: MULTIPLICACAO");
            System.out.println("O valor da multiplicacao dos numeros " + valor1 + " e " + valor2 + " é: " + resultado);
        }else if(escolha == '/'){
            resultado = (valor1 / valor2);
            System.out.println("A opcao escolhida foi: DIVISAO");
            System.out.println("O valor da divisao dos numeros " + valor1 + " e " + valor2 + " é: " + resultado);
        }else{
            System.out.println("ESCOLHA INVALIDA");
        }
    }
}
