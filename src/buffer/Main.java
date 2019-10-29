package buffer;

/**
 *
 * @author rafael
 */
public class Main {
     public static void main (String[] args)
    {
        String dados = "           ";
        Buffer b = new Buffer(dados.toCharArray());
        int i = 0;
        while (i < dados.length()) // buscando o início do identificador
        {
            i++;
            if(b.getAtual()+1 < dados.length() && b.proximo() != ' ')
            {
                b.marcaInicio();
                break;
            }
        }
        if(b.getPrimeiro() == 0)
        {
            System.out.println("String sem identificadores");
        }
        else
        {
            while (b.getAtual() < dados.length() && b.proximo() != ' ') // buscando o fim do identificador
                i++;
            
            b.anterior(); // volta um
            b.marcarUltimo();
            String buffer = String.copyValueOf(b.lexema()); // converte o char[] pra String
            System.out.println(buffer);
        }
    }
}