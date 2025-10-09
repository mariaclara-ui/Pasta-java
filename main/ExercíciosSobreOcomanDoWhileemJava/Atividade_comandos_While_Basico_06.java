import java.util.Scanner;
public class Atividade_comandos_While_Basico_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tempo=60;
        int peças=1;
        while (peças<10){
            System.out.println("Os segundos para a peça serão:"+tempo);
            tempo-=10;
        }
    }
}
