
/**
 * Certifica que seja passado apenas números.  
 * Exibe a tabuada do número informado.  
 * Exibe uma condição para finalizar o programa ou realizar nova consulta.  
 * @author Michael Vieira <Michael21rj@gmail.com>
 * @version 1.0
 */

public class Tabuada {
    public static void main(String[] args) {
    Criador.numero = Criador.CriarAltenticador();
    Criador.criarTabuada();
    Criador.criarCondicao();
}
}