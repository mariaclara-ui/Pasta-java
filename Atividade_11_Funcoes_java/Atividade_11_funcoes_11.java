package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nivel de bateria: ");
        double bateria = sc.nextDouble();
        double nivel=max(bateria);
    }
    public static double max(double nivel){
        if (nivel < 20) {
        System.out.println("Retorno imediato.");
        return 1;
    } else if (nivel <= 60) {
        System.out.println("Rota curta");
        return 2;
    } else {
        System.out.println("Rota longa");
        return 0;
    }
}
}
