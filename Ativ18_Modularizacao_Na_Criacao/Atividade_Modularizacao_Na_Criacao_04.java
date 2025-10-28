import java.util.Scanner;
public class Atividade_Modularizacao_Na_Criacao_04 {
    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
            return -1;
        }

        int fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial *= i;
            i++;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = sc.nextInt();

        int resultado = calcularFatorial(numero);

        if (resultado != -1) {
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        sc.close();
    }
}