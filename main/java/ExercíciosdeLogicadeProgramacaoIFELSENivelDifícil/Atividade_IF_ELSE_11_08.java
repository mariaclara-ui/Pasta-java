package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual a qauntidade restante:");
        double quantidade= sc.nextDouble();
        double resultado= (quantidade)*0.2;
        if (quantidade<resultado){
            System.out.println("Trocar.");
        }
        else{
            System.out.println("Continuar.");
        }
    }
}
