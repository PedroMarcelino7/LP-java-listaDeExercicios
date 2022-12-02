import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int salarioTotal, comissao;

        System.out.print("Insira seu salario fixo: ");
        int salarioFixo = scan.nextInt();

        System.out.print("Insira o valor das vendas efetuadas: ");
        int valorVendas = scan.nextInt();

        if(valorVendas <= 1500){
            comissao = ((valorVendas * 3) / 100);
            salarioTotal = salarioFixo + comissao;
        }else{
            comissao = ((((valorVendas - 1500) * 5) / 100) + 45);
            salarioTotal = salarioFixo + comissao;
        }

        System.out.println("\nSalario total: " + salarioTotal);

        System.out.println("\ncomissao: " + comissao);
    }
}
