import java.util.Scanner;
public class Exercicio_do_while_em_java_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String codigo;
        do {
            System.out.println("Digite o código RFID");//O código RFID e um número gravado que serve para identificar o objeto.
            codigo= sc.nextLine();
            if (codigo.length()!=8){
                System.out.println("Codigo invalido.");
            }
        }while (codigo.length()!=8);
        System.out.println("Código aceito.");
    }
}
