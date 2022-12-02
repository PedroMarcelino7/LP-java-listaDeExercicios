import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja digitar as horas ou gerar aleatoriamente?");
        System.out.println("Digite o numero correspondente a sua escolha");
        System.out.println("1: Digitar\n2: Aleatorio");
        System.out.print("--> ");
        byte opcao = scan.nextByte();

        if(opcao == 1){
            System.out.print("Insira as horas: ");
            int hora = scan.nextInt();

            if(hora >=0 && hora <= 6){
                System.out.println("Zzzzz");
            }else if(hora >= 7 && hora <= 11){
                System.out.println("Bom dia");
            }else if(hora >= 12 && hora <= 17){
                System.out.println("Boa tarde");
            }else if(hora >= 18 && hora <= 23){
                System.out.println("Boa noite");
            }
        }else if(opcao == 2){
            int hora = (int)(Math.random()*24);

            if(hora >=0 && hora <= 6){
                System.out.println("Zzzzz");
            }else if(hora >= 7 && hora <= 11){
                System.out.println("Bom dia");
            }else if(hora >= 12 && hora <= 17){
                System.out.println("Boa tarde");
            }else if(hora >= 18 && hora <= 23){
                System.out.println("Boa noite");
            }

            System.out.println("Horas: " + hora);
        }else{
            System.out.println("VALOR INVALIDO");
        }
    }
}

