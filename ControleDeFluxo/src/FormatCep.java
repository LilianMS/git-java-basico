public class FormatCep {
    public static void main(String[] args) {
        try {
            String cepF = formatarCep("2376506");
            System.out.println(cepF);
        } catch (CepException e) {
           
           System.out.println("Formato do CEP incorreto.");
        }
    }

    static String formatarCep(String cep) throws CepException{
        if(cep.length() != 8)
            throw new CepException();

            return "23.765-064";
    }
}
