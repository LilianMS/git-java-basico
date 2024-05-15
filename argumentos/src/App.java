import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome;
        String sobreNome;
        int idade;
        double altura;
        // recebendo dados via argumentos na linha de execução do programa (args)
        //nome = args[0];
        //sobreNome = args[1];
        //idade = Integer.valueOf(args[2]);
        //altura = Double.valueOf(args[3]);

        //recebendo dados via entrada no terminal
        System.out.println("Digite seu nome");
        nome = scanner.next();
        System.out.println("Digite seu sobrenome");
        sobreNome = scanner.next();
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        System.out.println("Digite sua altura");
        altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura);

        scanner.close();
       // System.out.println("Meu nome é " + nome + " " + sobreNome);
    }
}
