public class OverflowUnderflow {
    public static void main(String[] args) throws Exception {
        System.out.println(2147483647 + 1); //-2147483648
        System.out.println(-2147483648 - 1); //2147483647
    }
}
