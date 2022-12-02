public class Exercicio16 {
    public static void main(String[] args) throws Exception {
    int soma = 0, media = 0;

    for(int numero15 = 15; numero15 <= 100; numero15++){
        System.out.println(numero15);

        soma += numero15;
        media = soma/85;
    }
    System.out.println("Media: " + media);
    
    }
}
