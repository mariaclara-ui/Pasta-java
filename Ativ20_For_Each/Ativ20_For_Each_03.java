import java.util.Scanner;
public class Ativ20_For_Each_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soma=0;
        int media=0;
        int preco=0;
        System.out.println("Quantso preços vão ser digitados?");
        int quantosPrecos=sc.nextInt();
        int[] vet=new int[quantosPrecos];
        System.out.println("Qual e o valor dos preços?");
        for (int contador=0;contador<quantosPrecos;contador++){
            preco = sc.nextInt();
        }
        for (int precos:vet) {
            soma = +preco;
        }
        media=soma/quantosPrecos;
        System.out.println("A media dos preços será "+media);
    }
}

