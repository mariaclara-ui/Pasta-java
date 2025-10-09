import java.util.Scanner;
public class Atividade_comandos_While_Basico_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double contador=0;
        double temperatura;
        double somaTemperatura=0;
        while (contador<24){
            System.out.println("Digite a temperatura:");
            temperatura= sc.nextDouble();
            System.out.println("A temperatura por hora sera:"+temperatura);
            somaTemperatura+=temperatura;
            contador+=1;
        }
        double media;
        media=somaTemperatura/24;
        System.out.println("A media sera:"+media);
    }
}
