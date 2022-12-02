import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira sua nota: ");
        int nota = scan.nextInt();

            if(nota > 0 && nota < 6){
                System.out.println("REPROVADO");
            }else if(nota >= 6 && nota <= 10){
                System.out.println("APROVADO");
            }else{
                System.out.println("VALOR INVÁLIDO");
            }
    }
}
