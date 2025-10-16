import java.util.Scanner;
public class Exercicio_do_while_em_java_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        int meta = 120;
        do {
            System.out.println("Digite a quantidade de peça produzidas na celula CNC:");//Célula CNC é um conjunto de máquinas(controlhe numérico computadorizado)organizadas para trabalharem em conjunto.
            int quantidade = sc.nextInt();
            soma += quantidade;
            contador++;
        }while (soma<meta);
        System.out.println("O total depeças será:"+soma);
        System.out.println("O total de ciclos será:"+contador);
    }
}
