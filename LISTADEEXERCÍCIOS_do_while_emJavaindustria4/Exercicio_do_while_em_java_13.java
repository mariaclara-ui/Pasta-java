package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int tempo;
        do {
            System.out.println("Qual foi o tempo que o atanque está misturando?");//Menor quantidade de tempo determinado para o contexto.
            tempo= sc.nextInt();
        }while (tempo!=10);
        System.out.println("Parada aprovada.");
    }
}
