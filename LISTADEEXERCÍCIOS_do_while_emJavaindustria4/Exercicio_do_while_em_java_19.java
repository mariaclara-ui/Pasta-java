package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_19 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int totalPecas = 0;
        int totalFalhas = 0;
        double taxaFalhas;

        do {
            System.out.print("Informe o número de peças inspecionadas: ");
            int pecas = sc.nextInt();

            System.out.print("Informe o número de falhas detectadas: ");
            int falhas = sc.nextInt();

            totalPecas += pecas;
            totalFalhas += falhas;

            taxaFalhas = (double) totalFalhas / totalPecas * 100;

            System.out.printf("Taxa atual de falhas: %.2f%%%n", taxaFalhas);

        } while (taxaFalhas > 2.0);

        System.out.printf("Taxa final: %.0f%%%n", taxaFalhas);

    }
}

