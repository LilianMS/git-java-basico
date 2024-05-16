import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner;
        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá! Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Sr(a). " + nomeCliente + ", Qual o número de sua agência?");
        agencia = scanner.next();
        System.out.println("Agora, informe o número de sua conta: ");
        numero = scanner.nextInt();
        System.out.println("Digito o valor de depósito: ");
        saldo = scanner.nextDouble();
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
