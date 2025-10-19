package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_20 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int prateleira = 1;
        int totalPrateleiras = 5;
        System.out.println("Iniciando inventário cíclico (AS/RS)...");

        do {
            System.out.print("Digite o código da prateleira " + prateleira + ": ");
            String codigo = sc.nextLine();

            // Aqui poderíamos validar o código, mas para simplificar, consideramos sempre válido
            System.out.println("Prateleira " + prateleira + " validada com sucesso!");

            prateleira++; // Avança para a próxima prateleira
        } while (prateleira <= totalPrateleiras);
        System.out.println("Inventário concluído!");

    }
}
