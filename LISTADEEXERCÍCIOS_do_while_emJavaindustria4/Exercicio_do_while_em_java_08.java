package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de caixas:");//Simulação de AGV significa o uso de sistemas de computador para modelar e testar o comportamento de Veículos Guiados Automaticamente.
        int caixas;
        int soma = 1;
        do {
            caixas = sc.nextInt();
            soma += caixas;
        } while (soma <= 50);
        System.out.println("O total de caixas chegou a 50.");
    }
}
