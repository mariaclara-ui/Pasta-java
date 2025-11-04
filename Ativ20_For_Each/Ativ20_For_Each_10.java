import java.util.Scanner;

public class Ativ20_For_Each_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pontuacoes = {120, 85, 40, 150, 30, 90, 200};
        int destaques = 0;
        int precisaTreinar = 0;
        System.out.println("Pontuações dos jogadores:");
        for (int p : pontuacoes) {
            System.out.println(p);

            if (p >= 100) {
                destaques++;
            } else if (p < 50) {
                precisaTreinar++;
            }
            System.out.println("Destaques: " + destaques + " | Abaixo de 50: " + precisaTreinar);
        }
    }
}



