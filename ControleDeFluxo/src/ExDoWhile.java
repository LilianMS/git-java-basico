import java.util.Random;

public class ExDoWhile {
    public static void main(String[] args) {
        int tocou = 0;
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando.");
            tocou++;
        } while (tocando());
        System.out.println("Alo!!!?");
        System.out.println("\"Tocou " + tocou + " vezes\"");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
