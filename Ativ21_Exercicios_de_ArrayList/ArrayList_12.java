package Ativ21_Exercicios_de_ArrayLis;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_12 {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        while (true) {
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            nomes.add(nome);
        }
        System.out.print("Digite o valor de k (quantas rotações deseja fazer): ");
        int k = sc.nextInt();

        if (k < 0 || k > nomes.size()) {
            System.out.println("Valor de k inválido! Deve estar entre 0 e " + nomes.size());
        } else {

            for (int contador = 0; contador < k; contador++) {
                String primeiro = nomes.remove(0);
                nomes.add(primeiro);
            }

            System.out.println("Serão "+k+" rotaçoes");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }

    }
}
