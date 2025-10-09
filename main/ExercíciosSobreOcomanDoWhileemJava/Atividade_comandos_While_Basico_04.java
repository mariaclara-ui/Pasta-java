import java.util.Scanner;
public class Atividade_comandos_While_Basico_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estoque=500;
        while (estoque >100) {
            System.out.println("O estoque terá "+estoque+" quantidades");
            estoque -= 20;
        }
        System.out.println("O seu estoque tem 100 unidades.");
    }
}