package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_09 {
    static void main() { Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem de defeitos: ");
        double porcentagem= sc.nextDouble();
        Double resposta=max(porcentagem);
    }
    public static double max(double resposta){
        if (resposta>=10){
            System.out.println("Acione o alerta!");
            return 1;
        }
        else {
            System.out.println("Lote aprovado.");
            return 0;
        }
    }
}