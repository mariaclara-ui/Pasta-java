import java.util.Scanner;

public class Atividade_11_funcoes_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a carga");
        int carga= sc.nextInt();
        int resultado= sc.nextInt();
    }
    public  static int max(int carga){
        if (carga<=500){
            System.out.println("Digite a carga");
            return 1;
        }
        else if (carga<=1000){
            System.out.println("Alerta.");
            return 2;
        }
        else {
            System.out.println("Proibido.");
            return 0;
        }
    }
}
