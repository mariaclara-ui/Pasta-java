import java.util.Scanner;
public class Atividade_Sequencia_01_Dificil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade determos:");
        long numero=sc.nextLong();
        long a=0,b=1;
        for (int contador=1;contador<=numero;contador++){
            int divisores=0;
            divisores=0;
            long proximo= a +b;
            a=b;
            b=proximo;
            if (a>=0){
                for (int contador2=1;contador2<=a;contador2++){
                    if (a%contador2==0){
                        divisores++;
                    }
                }
                if (divisores==2) {
                    System.out.println(+a + "*");
                }else {
                        System.out.println(a+"");
                }
            }

        }
    }
}


