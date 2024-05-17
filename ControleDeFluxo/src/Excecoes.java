import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        double altura;
        Scanner entrada;
        entrada = new Scanner(System.in).useLocale(Locale.US);
        try{
            System.out.println("Qual seu nome?");
            nome = entrada.nextLine();
            System.out.println("Sr(a) " + nome + ", informe sua idade, por favor:");
            idade = entrada.nextInt();
            System.out.println("Digite sua altura:");
            altura = entrada.nextDouble();

            System.out.println("Dados coletados:\n "+nome+", "+idade+", "+altura);

            entrada.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos.");
            //System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
