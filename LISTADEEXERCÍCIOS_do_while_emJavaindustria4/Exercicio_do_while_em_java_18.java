package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_18 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        double takt;
        double soma = 0;
        int estacoes = 0;
        double media;

        System.out.print("Informe o Takt Time: ");
        takt = sc.nextDouble();

        System.out.println("Digite os tempos das estações (digite um valor negativo para encerrar):");

        do {
            System.out.print("Tempo da estação " + (estacoes + 1) + ": ");
            double tempo = sc.nextDouble();

            if (tempo < 0) break; // encerra entrada se negativo

            soma += tempo;
            estacoes++;
            media = soma / estacoes;

            System.out.printf("Média atual: %.2f | Estações: %d%n", media, estacoes);


        } while (soma / estacoes > takt);

        media = soma / estacoes;
        System.out.printf("%nResultado Final -> Média: %.2f | Estações: %d%n", media, estacoes);

    }
}

