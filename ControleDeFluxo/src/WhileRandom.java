import java.util.concurrent.ThreadLocalRandom;

public class WhileRandom {
    public static void main(String[] args) {
        double mesada = 50.0;
        double valorDoce;
        int doces = 0;
        while (mesada > 0) {
            valorDoce = valorAleatorio();
            //if(valorDoce < mesada){
                if(valorDoce > mesada)
                    valorDoce = mesada;
                mesada -= valorDoce;
                doces++;
                System.out.println("Doce adicionado ao carrinho: R$" + valorDoce);
                System.out.println("Saldo: R$" + mesada);
                System.out.println("Nº de doces: " + doces);
            //}
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
