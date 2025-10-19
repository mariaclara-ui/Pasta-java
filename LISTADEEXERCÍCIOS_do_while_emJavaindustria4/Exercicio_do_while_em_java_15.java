package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        double[] mediciones = {3.5, 21.0, 15.0};
        int i = 0; // Contador para as medições
        double valorMedido;
        boolean calibracaoOk = false;

        do {
            // Pega a próxima medição
            valorMedido = mediciones[i];
            i++; // Move para a próxima medição na próxima iteração

            // Verifica se a medição está dentro da faixa aceitável (4.0 a 20.0 mA)
            if (valorMedido >= 4.0 && valorMedido <= 20.0) {
                calibracaoOk = true;
            }

        } while (!calibracaoOk && i < mediciones.length); // Continua até que a calibração esteja OK ou acabem as medições

        // Exibe o resultado
        if (calibracaoOk) {
            System.out.println("Calibração OK: " + valorMedido + " mA");
        } else {
            System.out.println("Não foi possível calibrar com os valores fornecidos.");
        }
    }

}

