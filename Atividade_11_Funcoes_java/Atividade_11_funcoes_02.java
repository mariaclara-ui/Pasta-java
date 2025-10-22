import java.util.Scanner;
public class Atividade_11_funcoes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para lote aprovado");
        System.out.println("Digite 2 para lote reprovado");
        System.out.println("Digite 3 para lote retrabalhado");
        System.out.println("Digite 4 para analise manual");
        System.out.println("Qual e a situação do lote?");
        int estado = sc.nextInt();
        int situacao = max(estado);
    }
    public static int max(int situacao) {
        if (situacao == 1) {
            System.out.println("Lote aprovado.");
            return 1;
        } else if (situacao == 2) {
            System.out.println("Lote reprovado.");
            return 2;
        } else if (situacao == 3) {
            System.out.println("Lote retrabalhado.");
            return 3;
        } else if (situacao == 4) {
            System.out.println("Analise manual.");
            return 4;
        }
        else {
            System.out.println("Opcao invalida.");
            return 0;
        }
    }
}
