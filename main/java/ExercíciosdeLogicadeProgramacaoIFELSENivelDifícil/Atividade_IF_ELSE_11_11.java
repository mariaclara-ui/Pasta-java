package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digiete o nivel de bateria: ");
        double bateria = sc.nextDouble();
        if (bateria < 20) {
            System.out.println("Retorno imediato.");
        } else if (bateria <= 60) {
            System.out.println("Rota curta");
        } else {
            System.out.println("Rota longa");
        }
    }
}