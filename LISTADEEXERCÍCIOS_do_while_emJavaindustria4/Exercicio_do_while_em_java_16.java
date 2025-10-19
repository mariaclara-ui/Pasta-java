package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int totalA = 0, totalR = 0;
        int contador = 0;

        do {
            System.out.print("Digite o resultado da amostra " + (contador + 1) + " (A/R): ");
            String resultado = sc.next().toUpperCase();

            if (resultado.equals("A")) {
                totalA++;
                contador++;
            } else if (resultado.equals("R")) {
                totalR++;
                contador++;
            } else {
                System.out.println("Entrada inválida! Digite apenas A ou R.");
            }
        } while (contador < 10);

        System.out.println("\nResultado final:");
        System.out.println("A: " + totalA + " | R: " + totalR);

    }
}

