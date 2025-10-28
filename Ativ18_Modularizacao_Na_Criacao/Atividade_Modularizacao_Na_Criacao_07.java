import java.util.Scanner;
public class Atividade_Modularizacao_Na_Criacao_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero= sc.nextInt();
        if (numero<2){
            System.out.println("O número nao e primo.");
        }
        else {
            int Numero;
            for (Numero =2;Numero<numero;Numero++){
                if (numero % Numero == 0) {
                    System.out.println(numero + " não é primo!");
                }
            }
            if (Numero == numero) {
                System.out.println(numero + " é primo!");
            }
        }
    }
}
