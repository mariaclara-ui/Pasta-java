import java.util.Scanner;

public class Atividade_11_funcoes_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem do trafego suspeito:");
        int porcentagem = sc.nextInt();
        int resultado = max(porcentagem);
    }
    public static int max(int porTrafego){
        if (porTrafego<70){
            System.out.println("bloqueado");
            return 1;
        } else if (porTrafego<=15){
            System.out.println("Moderado");
            return 2;
        }
        else {
            System.out.println("Trafego normal");
            return 0;
        }
    }
}
