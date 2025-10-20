import java.util.Scanner;
public class Atividade_Sequencia_06_Dificil {
    public class TabuadaMultipla {
        public static void main(String[] args) {
            System.out.println("=== TABUADA DE MULTIPLICAÇÃO (1 a 10) ===");
            System.out.print("    "); // Espaço inicial para alinhar o cabeçalho

            // Cabeçalho com os multiplicadores (1 a 10)
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();

            // Linha separadora
            System.out.println("--------------------------------------------");

            // Linhas da tabuada (multiplicando)
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%2d |", i); // Mostra o número da linha (multiplicando)
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("%4d", i * j); // Resultado formatado
                }
                System.out.println(); // Quebra de linha ao final de cada linha
            }
        }
    }

}
