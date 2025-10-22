import java.util.Scanner;
public class Atividade_11_funcoes_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 0 se a frente, direita e esquerda estão livres ou 1 se tem algun obstáculo: ");
        int frente = sc.nextInt();
        int direita = sc.nextInt();
        int esquerda = sc.nextInt();
        int direcao = max(frente, direita, esquerda);
        Resultado(direcao);
        sc.close();
    }
    public static int max(int frente, int direita, int esquerda) {
        if (frente == 0) {
            System.out.println("O robô vai seguir em frente.");
            return 1;
        } else if (direita == 0) {
            System.out.println("O robô vai para a direita.");
            return 2;
        } else if (esquerda == 0) {
            System.out.println("O robô vai para a esquerda.");
            return 3;
        } else {
            System.out.println("O robô está parado.");
            return 0;
        }
    }
    public static void Resultado(int vale) {
        System.out.println("Direção="+vale);
    }
}

