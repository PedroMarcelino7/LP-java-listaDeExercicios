import java.util.Scanner;

public class ADivisivelPorB {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira algum valor (0 - 1000): ");
        int a = scan.nextInt();

        if(a < 0 || a > 1000){
            System.out.println("\nO valor e invalido");
        }else{
            System.out.print("Insira algum valor (0 - 20): ");
            int b = scan.nextInt();
    
            if(b < 0 || b > 20){
                System.out.println("\nO valor e invalido");
            }else{
                if(a >= b){
                    System.out.println("\nO valor de A e maior que B");

                    if(a % b == 0){
                        System.out.println("E divisivel");
                    }else{
                        System.out.println("Nao e divisivel");
                    }
                }else{
                    System.out.println("\nO valor de A e menor que B");
                }
            }
        }

        

        

    }
}
