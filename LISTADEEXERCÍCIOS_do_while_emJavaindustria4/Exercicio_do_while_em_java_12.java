package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número do palete:");//WMS, é o processo de verificar a precisão e a conformidade dos paletes que entram ou saem de um armazém.
        int quantidade;
        int contador=0;
        do {
            quantidade= sc.nextInt();
            contador++;
            System.out.println("Digite o número do palete:");
        }while (quantidade!=-1);
        System.out.println("A contagem final será:"+contador);
    }
}
