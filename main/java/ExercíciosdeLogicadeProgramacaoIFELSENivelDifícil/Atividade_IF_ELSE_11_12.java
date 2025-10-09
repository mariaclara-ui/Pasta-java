package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Crachá valido? ");  System.out.println("Seu crachá e valido?");
        System.out.println("Está com o capacete de segurança?");
        System.out.println("O horario do turno está correto?");
        String cracha= sc.nextLine();
        String seguranca= sc.nextLine();
        String horario= sc.nextLine();
        if (cracha.equals("sim")){
            System.out.println("Passe para proxima verificação");
        }
        else if (seguranca.equals("sim")){
            System.out.println("Passe para a proxima verificação:");
        }
        else if (horario.equals("sim")){
            System.out.println("Acesso aprovado.");
        }
    }
}
