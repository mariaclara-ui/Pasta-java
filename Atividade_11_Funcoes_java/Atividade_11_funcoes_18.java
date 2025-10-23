import java.util.Scanner;

public class Atividade_11_funcoes_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem de energia solar sobrando:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int energia= sc.nextInt();
        int Energia = max(energia);
        showResult(Energia);

    }
    public  static int max(int energia){
        if (energia>70){
            System.out.println("Usar solar");
            return 1;
        }
        else if (energia>=30){
            System.out.println("Hibrido");
            return 2;
        }
        else {
            System.out.println("Usar rede elétrica");
            return 0;
        }
    }
}
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
        }
