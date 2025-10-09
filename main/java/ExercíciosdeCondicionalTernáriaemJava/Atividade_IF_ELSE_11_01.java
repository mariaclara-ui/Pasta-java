package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Locale;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite 0 se a frente está livre ou 1 se tem obstáculo: ");
        int frente =sc.nextInt();
        System.out.println("Digite 0 se a direita está livre ou 1 se tem obstáculo: ");
        int direita =sc.nextInt();
        System.out.println("Digite 0 se a esquerda está livre ou 1 se tem obstáculo: ");
        int esquerda =sc.nextInt();
        if (frente == 0){
            System.out.println("O robô vai seguir em frente.");
        }
        else if (direita == 0){
            System.out.println("O robô vai para a direita.");
        }
        else if (esquerda == 0){
            System.out.println("O robô vai para a esquerda.");
        }
        else{
            System.out.println("O robô está parado.");
        }

    }
}
