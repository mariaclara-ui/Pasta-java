import java.util.Scanner;
public class Atividade_Modularizacao_Na_Criacao_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double primeiroNumero= sc.nextDouble();
        System.out.println("Digite o segundo número:");
        double seundoNumero= sc.nextDouble();
        System.out.println("Digite a operação desejada:");
        String operacao= sc.next();
        if (operacao.equals("+") || operacao.equalsIgnoreCase("soma")){
            double resultado=primeiroNumero+seundoNumero;
            System.out.println("O resultado será:"+resultado);
        }
        else if (operacao.equals("-") || operacao.equalsIgnoreCase("subitração")){
            double resultado=primeiroNumero-seundoNumero;
            System.out.println("O resultado será:"+resultado);
        }
        else if (operacao.equals("*") || operacao.equalsIgnoreCase("multiplicação")){
            double resultado=primeiroNumero*seundoNumero;
            System.out.println("O resultado será:"+resultado);
        }
        else if (operacao.equals("/") || operacao.equalsIgnoreCase("divisão")){
           if (seundoNumero==0){
               System.out.println("ERRO! operação invalida.");
           }
           else {
               double resultado=primeiroNumero/seundoNumero;
               System.out.println("O resultado será:"+resultado);
           }
        }
    }
}
