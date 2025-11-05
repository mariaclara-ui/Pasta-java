import java.util.ArrayList;
import java.util.Scanner;
class Produto {
    String nome;

    public class ArrayList_05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite os produtos");
            ArrayList<String> produto = new ArrayList<>();
            System.out.println("Digite seus preços");
            ArrayList<Double> preco = new ArrayList<>();
            while (true) {
                String linha = sc.nextLine().trim();
                if (linha.equalsIgnoreCase("FIM")) {
                }
                String[]partes linha.split(";");
                }
            }
        }
    }
}