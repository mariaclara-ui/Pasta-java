import java.util.Scanner;
public class Atividade_Modularizacao_Na_Criacao_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade= sc.nextInt();
        if (idade<12){
            System.out.println("infantil");
        }
        else if (idade<18) {
            System.out.println("adolecente");
        }
        else if (idade<64) {
            System.out.println("idoso");
        }
        else {
            System.out.println("idoso");
        }
    }
}
