import java.util.Random;
import java.util.Scanner;
public class Atividade_Sequencia_10_Dificil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minimo = 1;
        int maximo = 100;
        int numeroSecreto = random.nextInt(maximo - minimo + 1) + minimo;
        int tentativa;
        int tentativas = 0;
        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número secreto entre " + minimo + " e " + maximo + "!");
        while (minimo != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            minimo = sc.nextInt();
            if (minimo < numeroSecreto) {
                System.out.println("É MAIOR!");
            } else if (minimo > numeroSecreto) {
                System.out.println("É MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto " + numeroSecreto + "!");
                System.out.println("Tentativas: " + tentativas);

                if (tentativas <= minimo) {
                    System.out.println("Sua estratégia foi eficiente, quase como uma busca binária!");
                } else {
                    System.out.println("Você conseguiu, mas poderia ter sido mais eficiente.");
                    System.out.println("(Dica: uma busca binária levaria cerca de " + minimo + " tentativas)");
                }
            }
        }
    }
}
