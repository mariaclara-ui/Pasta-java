import java.util.Scanner;
public class Desafios_Manipulacao_basico_intermediario_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o numero final:");
        int numero= sc.nextInt();
        long a=0, b=1;
        System.out.println("o numero escolhido e "+numero);
        for (int i=1; i<=numero; i++) {
            System.out.println(a + "");
            long resultado = a + b;
            a = b;
            b = resultado;
        }
    }
}


