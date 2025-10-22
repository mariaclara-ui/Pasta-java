import java.util.Scanner;
public class Atividade_11_funcoes_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem:");
        System.out.println("Digite três números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Digite a porcentagem:");
        int porcentagem = sc.nextInt();
        if (porcentagem < 30) {
            System.out.println("Modo econômico.");
        } else if (porcentagem <= 70) {
            System.out.println("Modo normal.");
        } else {
            System.out.println("Modo turbo.");
        }
        int mostrarResultado = max(a, b, c);
        showResult(mostrarResultado);
    }
    public static int max(int x, int y, int z) {
        int resultado;
        if (x > y && x > z) {
            resultado = x;
        } else if (y > z) {
            resultado = y;
        } else {
            resultado = z;
        }
        return resultado;
    }
    public static void showResult(int value) {
        System.out.println("O maior número é: " + value);
    }
}

