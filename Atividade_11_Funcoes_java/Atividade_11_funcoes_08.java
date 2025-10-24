package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual a qauntidade restante:");
        double quantidade = sc.nextDouble();
        double resultado = (quantidade) * 0.2;
        double resultadoFinal = max(resultado,quantidade);
    }

    public static double max(double resultadoFinal, double quantidade) {
        if (quantidade < resultadoFinal) {
            System.out.println("Trocar.");
            return 1;
        } else {
            System.out.println("Continuar.");
            return 0;
        }
    }
}