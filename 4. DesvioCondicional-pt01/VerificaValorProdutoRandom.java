public class VerificaValorProdutoRandom {
    public static void main(String[] args) throws Exception {
        int precoProduto1 = (int)((Math.random()*1000)+1);
        int precoProduto2 = (int)((Math.random()*1000)+1);

        if(precoProduto1 < precoProduto2){
            System.out.println("O Produto 1 é mais barato");
        }else if(precoProduto1 > precoProduto2){
            System.out.println("O Produto 2 é mais barato");
        }else{
            System.out.println("Os Produtos têm o mesmo preço");
        }

        System.out.println("Produto 1: " + precoProduto1);
        System.out.println("Produto 2: " + precoProduto2);
    }
}
