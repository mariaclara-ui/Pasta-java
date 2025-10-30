import java.util.Scanner;

public class Atividade_11_funcoes_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a intensidade da soldagem:");
        int soldagem = sc.nextInt();

        max(soldagem);
    }

    public static int max(int soldagem) {
        if (soldagem < 100) {
            System.out.println("Soldagem fraca.");
            return 1;
        } else if (soldagem == 100) {
            System.out.println("Soldagem média.");
            return 2;
        } else {
            System.out.println("Acelerar o processo.");
            return 3;
        }
    }
}
