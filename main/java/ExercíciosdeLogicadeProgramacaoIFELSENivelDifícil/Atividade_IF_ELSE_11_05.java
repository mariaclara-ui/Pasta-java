package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite as as horas de uso");
        int horas= sc.nextInt();
        if (horas<500){
            System.out.println("Pouca urgência.");
        }
        else if (horas<=1000) {
            System.out.println("Média urgência.");
        }
        else {
            System.out.println("Alta urgência.");
        }

    }

}
