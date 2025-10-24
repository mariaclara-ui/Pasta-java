package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a temperatura da maquina:");
        double temperatura= sc.nextDouble();
        double temperaturaTotal=max(temperatura);
    }
    public static double max(double temperaturaTotal){
        if (temperaturaTotal >= 90) {
            System.out.println("Temperatura OK.");
            return 1;
        }
        else {
            System.out.println("Desligar.");
            return 0;
        }
    }
}


