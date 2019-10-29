/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffer;

/**
 *
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
    private char dados[] = {' ','i','n','t','9','8','3','7','1','2',' '};
    
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
        int p=primeiro,u=ultimo;
        char [] temp = new char [aux];
        for (int i = 0; i < aux; i++)
        {
            temp[i]=dados[p];
            p++;
        }
        return temp;
    }
}
