package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem: ");
        double porcentagem=sc.nextDouble();
        if (porcentagem<30){
            System.out.println("Modo econômico.");
        }
        else if (porcentagem<=70) {
            System.out.println("Modo normal.");
        }
        else{
            System.out.println("Modo normal.");
        }
    }
}
