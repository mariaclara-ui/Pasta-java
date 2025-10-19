package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_11 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a umildade:");
        int umildade;
        int comtador=0;
        do {umildade=sc.nextInt();
            System.out.println("Digite uma nova porcentagem de umidade:");//É o gerenciamento das condições de umidade no armazenamento de materiais brutos para evitar sua deterioração.
            comtador++;
        }while (umildade>=30 && umildade<=55);
            System.out.println("Valor aceito"+umildade);
    }
}
