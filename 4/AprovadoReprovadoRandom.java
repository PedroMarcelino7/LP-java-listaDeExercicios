public class AprovadoReprovadoRandom {
    public static void main(String[] args) throws Exception {
        var nota = (Math.random()*10);

        System.out.println(nota < 6 ? "REPROVADO" : "APROVADO");
        System.out.println("Nota: " + nota);
    }
}
