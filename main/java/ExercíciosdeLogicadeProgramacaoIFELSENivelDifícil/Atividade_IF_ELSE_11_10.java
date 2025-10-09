package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double temperatura= sc.nextDouble();
        if (temperatura<0){
            System.out.println("Alerta congelamento! ");
        }
        else if (temperatura<=40){
            System.out.println("Normal");
        }
        else {
            System.out.println("Alerta superaquecimento!");
        }

    }
}
