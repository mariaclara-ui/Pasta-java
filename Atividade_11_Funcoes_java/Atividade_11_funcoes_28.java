import java.util.Scanner;

public class Atividade_11_funcoes_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de autonomia do veículo:");
        int autonomo = sc.nextInt();

        System.out.println("Digite o nível de trânsito atual:");
        int transito = sc.nextInt();

        max(autonomo, transito);
    }

    public static void max(int autonomo, int transito) {
        if (autonomo < transito) {
            System.out.println("Recalcular rota.");
        } else if (autonomo == transito) {
            System.out.println("Rota alternativa.");
        } else {
            System.out.println("Seguir normal.");
        }
    }
}

