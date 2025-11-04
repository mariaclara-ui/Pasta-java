package Ativ20_For_Each;
import java.util.Scanner;
class Produto {
    String nome;
    double preco;
public class Ativ20_For_Each_07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres produtos e seus preços:");
        Produto[] produtos = new Produto[3];
        for (int informacoes = 0; informacoes < produtos.length; informacoes++) {
            produtos[informacoes] = new Produto();

            System.out.print("Nome do produto: ");
            produtos[informacoes].nome = sc.nextLine();

            System.out.print("Preço do produto: ");
            produtos[informacoes].preco = sc.nextDouble();
            sc.nextLine();
        }
        for (Produto informacoes : produtos) {
            if (informacoes.preco >= 50) {
                System.out.println(produtos + " (caro)");
            } else {
                System.out.println(produtos);
            }

        }
    }
}
}


