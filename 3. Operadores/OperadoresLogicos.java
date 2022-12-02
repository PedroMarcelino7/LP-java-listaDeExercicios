public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a > b || c < d); //true
        System.out.println(a > b | c < d); //true
        System.out.println(a > b && c < d); //false
        System.out.println(a > b & c < d); //false
        System.out.println(a > b != c < d); //true
    }
}
