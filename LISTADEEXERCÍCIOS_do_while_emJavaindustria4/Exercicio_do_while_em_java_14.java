package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_14 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o codigo ou fim para encerrar:");
        String resposta;
        int contador=0;
        do {
            System.out.println("Digite o codigo");
            resposta= sc.nextLine();
            contador++;
        }while (!resposta.equalsIgnoreCase("Fim"));
        System.out.println("O número de ocorrências até o codigo é:"+contador);
    }
}
