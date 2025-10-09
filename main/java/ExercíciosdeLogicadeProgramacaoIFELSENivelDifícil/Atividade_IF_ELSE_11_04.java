package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Digite qual o seu cargo?");
        String cargo= sc.nextLine();
        if (cargo.equals("operador básico")){
            System.out.println("Acesso restrito.");
        }
        else if (cargo.equals("supervisor")){
            System.out.println("Acesso parcial");
        }
        else if (cargo.equals("engenheiro")) {
            System.out.println("Acesso total");
        }
        else{
            System.out.println("Cargo não reconhecido.");
        }
    }
}
