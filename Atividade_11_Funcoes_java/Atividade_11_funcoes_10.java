package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double temperatura= sc.nextDouble();
        double temperaturaFinal=max(temperatura);
    }
    public static double max(double temperaturaFinal){
        if (temperaturaFinal<0){
            System.out.println("Alerta congelamento! ");
            return 1;
        }
        else if (temperaturaFinal<=40){
            System.out.println("Normal");
            return 2;
        }
        else {
            System.out.println("Alerta superaquecimento!");
            return 0;
        }
    }
}
