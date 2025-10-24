package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade de peças produzida por hora:");
        int valor= sc.nextInt();
        int quantidade=max(valor);
    }
    public static int max(int quantidade){
        if (quantidade<=50){
            System.out.println("Desempenho baixo.");
            return 1;
        }
        else if (quantidade<=100){
            System.out.println("Desempenho regular.");
            return 2;
        }
        else {
            System.out.println("Desempenho ótimo.");
            return 0;
        }
    }
}
