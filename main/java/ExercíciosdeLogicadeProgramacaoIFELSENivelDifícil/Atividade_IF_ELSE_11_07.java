package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o peso:");
        double peso= sc.nextDouble();
        if (peso<10){
            System.out.println("Leve.");
        }
        else if (peso<=30){
            System.out.println("Pesado.");
        }
        else{
            System.out.println("Muito pesado.");
        }
    }
}
