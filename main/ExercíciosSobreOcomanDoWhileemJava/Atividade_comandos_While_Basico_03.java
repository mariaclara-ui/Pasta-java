import java.util.Scanner;
public class Atividade_comandos_While_Basico_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int QuantasHoras=1;
        int somahoras=0;
        while (QuantasHoras<8){
            System.out.println("Digite quanto a maquina produz por hora:");
            int maquina= sc.nextInt();
            QuantasHoras+=1;
            somahoras +=maquina;
        }
        System.out.println("A soma total será:"+somahoras);
    }
}
