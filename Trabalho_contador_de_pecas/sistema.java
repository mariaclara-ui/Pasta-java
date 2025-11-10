import java.util.Scanner;
public class sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha qual e o proposito da arruela:");
        System.out.println("1-Montagens gerais");
        System.out.println("2-Máquinas/Motores");
        System.out.println("3-Aumentar atrito");
        System.out.println("4-Montagens sujeitas a dilatação");
        System.out.println("5-eixos/rolamentos");
        System.out.println("6-Impedir vazamentos");
        System.out.println("7-Evitar condução eletrica");
        int pecas = sc.nextInt();
        int contagem;
        if (pecas==1){
            System.out.println("Será preciso 100 arruelas por kit.");
            contagem=100;
            System.out.println("Quantos kits são necessarios ?");
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else if (pecas==2){
            System.out.println("Será preciso 150 arruelas por kit.");
            contagem=150;
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else if (pecas==3){
            System.out.println("Será preciso 120 arruelas por kit.");
            contagem=120;
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else if (pecas==4){
            System.out.println("Será preciso 80 arruelas por kit.");
            contagem=80;
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else if (pecas==5){
            System.out.println("Será preciso 60 arruelas por kit.");
            contagem=60;
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else if (pecas==6){
            System.out.println("Será preciso 90 arruelas por kit.");
            contagem=90;
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else if (pecas==7){
            System.out.println("Será preciso 100 arruelas por kit.");
            contagem=100;
            int necessarios= sc.nextInt();
            int resultado=necessarios*contagem;
            System.out.println("São necessarias "+resultado+" arruelas");
        }
        else {
            System.out.println("ERRO");
        }
    }
}
