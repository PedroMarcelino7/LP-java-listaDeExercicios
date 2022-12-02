public class ADivisivelPorBRandom {
    public static void main(String[] args) throws Exception {
        int a = (int)(Math.random()*1000);
        int b = (int)(Math.random()*20);

        if(a % b == 0){
            System.out.println("a é divisível por b");
        }else{
            System.out.println("Não é divisível");
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
