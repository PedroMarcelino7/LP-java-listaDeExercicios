public class Concatenacao {
    public static void main(String[] args) throws Exception {
        System.out.println("Java" + 1 + 2 + 3); //Java123
        System.out.println("Java" + 1 * 2 * 3); //Java6
        System.out.println("" + 1 + 2 + 3 + "Java"); //123Java
        System.out.println( 1 * 2 * 3 + "Java"); //6Java
    }
}
