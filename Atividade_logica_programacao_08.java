import java.util.Random;
public class Atividade_logica_programacao_08 {
    public static void main(String[] args) {
        Random random=new Random();
        int total=0;
        for (int maquina=1;maquina<=50;maquina++){
            int tempo= random.nextInt(1000);
            System.out.println("O tempo gastado em hora será:"+tempo);
            total+=tempo;
        }
        System.out.println("O tempo total da manutenção por ano será" +total+ "horas.");
    }
}
