import java.util.Scanner;
public class Atividade_comandos_While_Basico_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contagem=1;
        while (contagem<=120){
            System.out.println("A pressão está medindo"+contagem);
            contagem+=1;
        }
        System.out.println("Você atingio o limite da pressão.");
    }
}
