import java.util.Scanner;

public class Atividade_11_funcoes_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o turno:");
        int classificacao = sc.nextInt();
        int sistema = max(classificacao);

    }
        public  static int max(int horas){
            if (horas<=12){
                System.out.println("Está de manhã.");
                return 1;
            }
            else if (horas<=18){
                System.out.println("Está de tarde.");
                return 2;
            }
            else {
                System.out.println("Está de noite.");
                return 0;
            }

    }

}



