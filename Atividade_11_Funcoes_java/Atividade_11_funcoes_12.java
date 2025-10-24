package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite (sim) se seu crachá valido, se está com o capacete de segurança e o horario do turno está correto)");
        String cracha = sc.nextLine();
        String seguranca = sc.nextLine();
        String horario = sc.nextLine();
        String respostas=max(cracha,seguranca,horario);
    }
    public static String max(String cracha,String seguranca,String horario){
        if (cracha.equals("sim") && seguranca.equals("sim") && horario.equals("sim")) {
            System.out.println("Acesso aprovado.");
            return "Aprovado";
        } else{
            System.out.println("Acesso negado.");
            return "Negado";
        }
    }
}
