package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        double[] leituras = {3.0, 2.3, 2.0, 2.4, 1.5, 1.8, 1.9, 2.1};


        int totalLeituras = 0;
        int contagemConsecutivasAbaixoDe2_5 = 0;


        do {

            double leituraAtual = leituras[totalLeituras];


            totalLeituras++;


            if (leituraAtual < 2.5) {
                contagemConsecutivasAbaixoDe2_5++;
            } else {

                contagemConsecutivasAbaixoDe2_5 = 0;
            }


            System.out.println("Leitura: " + leituraAtual);

        } while (contagemConsecutivasAbaixoDe2_5 < 3);

        System.out.println("Total de leituras: " + totalLeituras);
    }
}
