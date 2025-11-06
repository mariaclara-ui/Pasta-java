import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço de acordo como estoque:");
        String estoque = sc.nextLine();
        String[] precos = estoque.split(",");
        ArrayList<String> lista = new ArrayList<>();
        for (String t : precos) {
            t = t.trim();
            if (!t.isEmpty()) {
                lista.add(t);
            }
        }
        System.out.println("\n Valor de estoque exibido.");
        int numero = 1;
        for (String preco : precos) {
            System.out.println(numero + ". " + estoque);

        }
    }
}