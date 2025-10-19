package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_04 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual e o numero  escolhido?");//Painel MES que exibe indicadores de produção
        int contador=0;
        int numero;
        do {
            numero= sc.nextInt();
            if (numero == 1) {
                System.out.println("Registrar parada");
            } else if (numero == 2) {
                System.out.println("Registrar produção");
            }else if (numero==3) {
                System.out.println("Sair");
            }
            else {
                System.out.println("Numero invalido");
            }
        }while (numero!=3);
    }
}
