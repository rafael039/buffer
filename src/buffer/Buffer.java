package buffer;

/**
 * @author rafael
 */
public class Buffer {
    //char proximo();
    //marcaInicio();
    //mrcarUltimo();
    //retrair(int);
    //retrairAoUltimo();
    //String lexema();
    
    private int atual = 0;
    private int primeiro;
    private int ultimo;
    private char dados[];
    
    public Buffer(char[] dados) {
        this.atual = 0;
        this.primeiro = 0;
        this.ultimo = 0;
        this.dados = dados;
    }
    
    public char proximo()
    {
        return dados[++atual];
    }
    public void anterior()
    {
        atual--;
    }
    public void marcaInicio()
    {
        primeiro = atual;
    }
    public void marcarUltimo()
    {
        ultimo = atual;
    }
    public void retrair(int n)
    {
        atual-=n;
    }
    public char[] lexema()
    {
        int aux = ultimo-primeiro+1;
        int p=primeiro;
        char [] temp = new char [aux];
        for (int i = 0; i < aux; i++)
        {
            temp[i]=dados[p];
            p++;
        }
        return temp;
    }
    
    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int getAtual() {
        return atual;
    }

    public void setAtual(int atual) {
        this.atual = atual;
    }
}
