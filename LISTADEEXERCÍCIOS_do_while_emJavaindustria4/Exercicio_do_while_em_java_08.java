package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de caixas:");
        int caixas;
        int soma = 1;
        do {
            caixas = sc.nextInt();
            soma += caixas;
        } while (soma <= 50);
        System.out.println("O total de caixas chegou a 50.");
    }
}
