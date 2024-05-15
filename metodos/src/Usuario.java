public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);

    }
}
