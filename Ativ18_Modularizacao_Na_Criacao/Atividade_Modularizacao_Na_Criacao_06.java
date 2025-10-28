import java.util.Scanner;

public class Atividade_Modularizacao_Na_Criacao_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de notas dos alunos:");
        int numeroDeNotas = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.println("Digite a nota " + i + ":");
            int valor = sc.nextInt();

            if (valor < 0 || valor > 10) {
                System.out.println("Nota inválida! Digite novamente.");
                i--; // para refazer a nota inválida
                continue;
            }

            soma += valor;
        }
    }
}
