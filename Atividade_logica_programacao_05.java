import java.util.Random;
public class Atividade_logica_programacao_05 {
    public static void main(String[] args) {
        Random random=new Random();
        double total=0;
        double resposta=0;
       for ( int maquinas=0;maquinas<=10;maquinas++){
           double consumo= random.nextDouble()*100;
           System.out.printf("O consumo será: %.2f%n",consumo);
           total+=consumo;
       }
      resposta=total*24;
        System.out.printf("O consumo total será: %.2f%n",resposta);
    }
}
