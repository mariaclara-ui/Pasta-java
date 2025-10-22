import java.util.Scanner;

public class Atividade_11_funcoes_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas de  uso:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int horas = max(a, b, c);
        showResult(horas);
        sc.close();

    }
    public static int max(int baixa,int media,int alta) {
        int aux;
        if (baixa > media && baixa > alta) {
            aux= media;
        }

    }
}
