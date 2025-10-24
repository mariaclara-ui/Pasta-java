package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_07 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o peso:");
        double peso=sc.nextDouble();
        double qualPeso=max(peso);
    }
    public static double max(double qualPeso){
        if (qualPeso<10){
            System.out.println("Leve.");
            return 1;
        }
        else if (qualPeso<=30){
            System.out.println("Pesado.");
            return 2;
        }
        else{
            System.out.println("Muito pesado.");
            return 0;
        }
    }
}
