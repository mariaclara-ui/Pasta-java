import java.util.Scanner;

public class Atividade_Modularizacao_Na_Criacao_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura:");
        double temperatura = sc.nextDouble();
        System.out.println("Qual a conversao desejada?");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("Fahrenheit")) {
            double conversa = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + temperatura);
        }
        if (resposta.equalsIgnoreCase("Celsius")){
            double conversa = (temperatura - 32 ) * 5/9;}
        System.out.printf("A temperatura em Celsius é: %.2f°C%n", temperatura);
    }
}
