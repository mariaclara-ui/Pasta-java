package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_09 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual e o resultado da simulação AGV:");//Ferramenta que replica o comportamento de um veículo Guiado Automaticamente
        boolean resultado;
        int contador=0;
        do {
            resultado= sc.hasNextBoolean();
            System.out.println("Seu resultado e falso tente novamente até chagar no verdadeiro:");
            contador++;

        }while (!resultado);
        System.out.println("Seu resultado e verdadeiro.");
        System.out.println("Foi preciso "+contador+" tentativas atá chegar no verdadeiro.");
    }
}
