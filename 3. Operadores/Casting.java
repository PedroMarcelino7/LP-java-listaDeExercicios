public class Casting {
    public static void main(String[] args) throws Exception {
        long numero1 = 2147483648L;
        int numero2 = (int)numero1;

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
    }
}
