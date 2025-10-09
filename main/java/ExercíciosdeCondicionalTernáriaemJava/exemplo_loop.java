import java.util.Scanner;
public class exemplo_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int soma=0;
        while (x !=0) {
            soma += x; //atribuicao soma = soma mais o número
            x = sc.nextInt();
        }
        System.out.println(soma);
    }
}
