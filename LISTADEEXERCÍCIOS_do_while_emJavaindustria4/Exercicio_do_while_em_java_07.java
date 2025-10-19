package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_07 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o consumo de energia:");//Consumo de Energia por Turno, consumo gasto de energia por turno.
        int consumo;
        int soma=0;
        do {consumo= sc.nextInt();
            soma+=consumo;
        }while (consumo!=0);
        System.out.println("O comsumo total será de:"+soma);
    }
}
