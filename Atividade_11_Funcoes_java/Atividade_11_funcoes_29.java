import java.util.Scanner;

public class Atividade_11_funcoes_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de defeitos encontrados:");
        int inspecao = sc.nextInt();
        max(inspecao);
    }

    public static int max(int defeitos) {
        if (defeitos > 20) {
            System.out.println("Reprovar.");
            return 1;
        } else if (defeitos > 10) {
            System.out.println("Retrabalho.");
            return 2;
        } else {
            System.out.println("Aprovar.");
            return 3;
        }
    }
}
