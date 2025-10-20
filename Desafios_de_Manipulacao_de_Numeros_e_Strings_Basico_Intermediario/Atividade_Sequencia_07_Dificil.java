import java.util.Scanner;
public class Atividade_Sequencia_07_Dificil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int numero1= sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2= sc.nextInt();
        while (numero2!=0){
            int resto=numero1%numero2;
            numero1=numero2;
            numero2=resto;
        }
        System.out.println("O MDC desses dois números será: "+numero1);
    }
}
