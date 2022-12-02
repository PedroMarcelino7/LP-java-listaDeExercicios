public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        String vazia = "";
        String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};

        for(int i = 0; i < 10; i++){
            vazia = vazia + numeros[i];

            System.out.println(vazia);
        }
    }
}
