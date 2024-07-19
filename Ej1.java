/*
Encuentra un m´etodo que permita definir la potencia de un n´umero. Los datos son a y b y lo que se desea
es calcular a elevado a la b.
*/
public class Ej1
{   
    public int potencia(int a, int b){
        int res;
        if(b == 0)
            res = 1;
        else
            res = a * potencia(a, b-1);
        return res;
    }
}
