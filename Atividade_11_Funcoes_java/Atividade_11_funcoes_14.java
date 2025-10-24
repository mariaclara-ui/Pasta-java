package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_14 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a velocidade da esteira:");
        int velocidade= sc.nextInt();
        int velocidadeFinal=max(velocidade);
    }
    public static int max(int velocidadeFinal){
        if (velocidadeFinal<=6){
        System.out.println("Esteira lenta.");
        return 1;
    }
        else if (velocidadeFinal<=10){
        System.out.println("Esteira média.");
        return 2;
    }
        else {
        System.out.println("Esteira rápida.");
        return 0;
    }
}
}
