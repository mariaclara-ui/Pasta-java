import java.util.Scanner;
public class Exercicio_do_while_em_java_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contador=0;
        int limite=500;
        int soma=0;
        do {
            System.out.println("Digite o  peso de cada peça:");
            int quantidade= sc.nextInt();
            soma+=quantidade;
            contador++;
        }while (soma<limite);
        System.out.println("A soma atingio o limite "+limite);//
    }
}
