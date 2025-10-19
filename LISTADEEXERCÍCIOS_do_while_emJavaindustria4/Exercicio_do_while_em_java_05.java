package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_05 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int contador=0;
        int limite=500;
        int soma=0;
        do {
            System.out.println("Digite o  peso de cada peça:");//Lote de Impressão 3D (Peso Máximo),uantidade máxima de material que uma impressora pode utilizar de uma só vez.
            int quantidade= sc.nextInt();
            soma+=quantidade;
            contador++;
        }while (soma<limite);
        System.out.println("A soma atingio o limite "+limite);//
    }
}
