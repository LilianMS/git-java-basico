public class App {
    public static void main(String[] args) throws Exception {
        double saldo = 25000.00;
        double valorSolicitado;
        String mensagem;

        valorSolicitado = Double.valueOf(args[0]);

        mensagem = valorSolicitado <= saldo
        ? "Transação bem sucedida. Bom dia!"
        :  "Desculpe! Saldo insuficiente!";

        System.out.println("Bem vindo!");
        //if(valorSolicitado <= saldo)
        //{
        //    saldo -= valorSolicitado;
        //    System.out.println("Você retirou: R$" + valorSolicitado);
        //    System.out.println("Seu novo saldo é: R$" + saldo);
        //}else
        //    System.out.println("Desculpe! Saldo insuficiente: R$" + saldo);

        System.out.println(mensagem);
    }
}
