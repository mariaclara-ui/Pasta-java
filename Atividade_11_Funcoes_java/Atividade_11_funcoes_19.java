import java.util.Scanner;

public class Atividade_11_funcoes_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o ph da água:");
        int pH= sc.nextInt();
        int classificacao = max(pH);
    }
    public  static int max(int pH){
        if (pH <= 7) {
            System.out.println("Basico");
            return 1;
        }
        else if(pH == 7){
            System.out.println("Neutro");
            return 2;
        }
        else {
            System.out.println("Acido");
            return 0;
        }
    }
}

