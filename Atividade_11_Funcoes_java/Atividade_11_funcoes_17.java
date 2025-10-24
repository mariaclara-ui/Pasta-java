package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Os robôs A e B estão funcionado?");
        String roboA = sc.nextLine();
        String roboB = sc.nextLine();
        String robos = max(roboA, roboB);
    }
    public static String max(String roboA, String roboB) {
        if (roboA.equals("não") && roboB.equals("não")) {
            System.out.println("Parar a linha.");
            return "Parar a linha.";
        } else if (roboA.equals("sim") && roboB.equals("não")) {
            System.out.println("Acionar robô B.");
            return "Acionar robô B.";
        } else {
            System.out.println("Continuar produção.");
            return "Continuar produção.";
        }
    }
}

