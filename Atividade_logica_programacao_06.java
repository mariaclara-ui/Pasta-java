import java.util.Random;
public class Atividade_logica_programacao_06 {
    public static void main(String[] args) {
        Random random=new Random();
        double total=0;
        double resposta=0;
        for (int materiais=1;materiais<=50;materiais++){
            double consumo= random.nextDouble()*1000;
            System.out.printf("O consumo do material será: %.2f%n",consumo);
            total+=consumo;
        }
        resposta=total/50;
        System.out.printf("O consumo medio será: %.2f%n",resposta);
    }
}
