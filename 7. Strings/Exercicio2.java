public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        String[] alfabetoCompleto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String alfabeto = "";

		for(int i = 0; i < 26; i++){
            alfabeto = alfabeto + alfabetoCompleto[i];

			System.out.println(alfabeto.toUpperCase());
		}
    }
}
