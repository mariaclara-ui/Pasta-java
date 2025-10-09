package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem de defeitos: ");
        double porcentagem= sc.nextDouble();
        if (porcentagem>=10){
            System.out.println("Acione o alerta!");
        }
        else {
            System.out.println("Lote aprovado.");
        }
        
    }
}
