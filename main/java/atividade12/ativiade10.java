package atividade12;
import java.util.Locale;
import java.util.Scanner;
public class ativiade10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int numero1= sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int numero2= sc.nextInt();
        System.out.println("Digite o terceiro valor;");
        int numero3= sc.nextInt();
        int resposta= (numero1+numero2+numero3)/3;
        System.out.println("A media sera:"+resposta);
    }
}
