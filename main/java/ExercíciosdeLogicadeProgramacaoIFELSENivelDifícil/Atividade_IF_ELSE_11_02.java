package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_02 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Qual o estado do lote:");
        String estado= sc.nextLine();
        if (estado.equals("aprovado")){
            System.out.println("Lote aprovado.");
        }
        else if (estado.equals("reprovado")){
            System.out.println("Lote reprovado.");
        }
        else if (estado.equals("retrabalhado.")) {
            System.out.println("Lote retrabalhado.");
        }


    }
}
