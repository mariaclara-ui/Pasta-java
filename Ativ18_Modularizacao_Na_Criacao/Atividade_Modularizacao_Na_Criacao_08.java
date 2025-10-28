import java.util.Scanner;

public class Atividade_Modularizacao_Na_Criacao_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor do investimento:");
        double valor= sc.nextDouble();
        System.out.println("Digite a taxa de juros mensal:");
        double taxa= sc.nextDouble();
        System.out.println("Digite o numero de meses de investimento:");
        int meses= sc.nextInt();
        if (valor <= 0) {
            System.out.println("Valor inicial inválido! O investimento deve ser maior que zero.");
        } else if (taxa < 0) {
            System.out.println("Taxa de juros inválida! Deve ser maior ou igual a zero.");
        } else if (meses <= 0) {
            System.out.println("Número de meses inválido! Deve ser maior que zero.");
        } else {
            double valor1Final= valor;
            int contador= 0;
        }
while (valor < meses){
    valor = valor + (valor * taxa / 100);
    valor++;
}
System.out.println("O valor final do investimento após %d meses é: R$ %.2f%n");
    }
}
