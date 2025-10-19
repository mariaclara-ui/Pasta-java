package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_06 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite A para aprovado e R para reprovado é fim para o total de respostas:");
        String nota= sc.next();//Checagem de Qualidade (Amostras), inspecionar uma pequena parte representativa de um lote inteiro.
        String letra;
        int contadora=1;
        int contadorb=0;
        do {letra=sc.nextLine();
            if (letra.equalsIgnoreCase("A")){
                System.out.println("Aprovado.");
                contadora++;
            }
            else if (letra.equalsIgnoreCase("B")){
                System.out.println("Reprovado.");
                contadorb++;
            }
        }while (!letra.equalsIgnoreCase("fim"));
        System.out.println("O total de aprovados será:"+contadora);
        System.out.println("O total de reprovados será:"+contadorb);
    }
}
