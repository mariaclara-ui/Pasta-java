import java.util.Scanner;

public class Atividade_Modularizacao_Na_Criacao_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor e as moedas no formato: valor moedaOrigem moedaDestino");
        System.out.println("Exemplo: 100 BRL USD");
        String entrada = sc.nextLine();
        String []partes = entrada.split("valor");
        double valor = Double.parseDouble(partes[0]);
        String moedaOrigem = partes[1].toUpperCase();
        String moedaDestino = partes[2].toUpperCase();
double resultado=0;
        if (moedaOrigem.equals("BRL") && moedaDestino.equals("USD")) {
            resultado = valor / 5.0; // exemplo: 1 USD = 5 BRL
        } else if (moedaOrigem.equals("BRL") && moedaDestino.equals("EUR")) {
            resultado = valor / 6.0; // exemplo: 1 EUR = 6 BRL
        } else if (moedaOrigem.equals("USD") && moedaDestino.equals("BRL")) {
            resultado = valor * 5.0;
        } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("BRL")) {
            resultado = valor * 6.0;
        } else if (moedaOrigem.equals(moedaDestino)) {
            resultado = valor; // mesma moeda, sem conversão
        } else {
            System.out.println("Conversão não suportada.");
            sc.close();
            return;
        }
        System.out.println("Valor convertido: " + resultado + " " + moedaDestino);
        sc.close();
    }
}
