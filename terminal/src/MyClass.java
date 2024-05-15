/**
 * <h1>Teste de Documentação com JavaDoc</h1>
 * <p>
 * <b>Nota:</b>Estudando terminal e argumentos e testando o recurso Javadoc
 * Verificando importancia da documentação do códigos e as ferramentas para isso.
 * Usando as tags para marcar pontos de exibição da documentação
 * @author LilianMS
 * @version 1
 * @since 15/05/24
 */

public class MyClass {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudando terminal e JavaDoc com exemplos!");
    }
     /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
  public int somar(int numeroUm, int numeroDois) {
    return  numeroUm + numeroDois;
}
}

//javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
