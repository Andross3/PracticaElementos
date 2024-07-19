/*Escribe un proceso recursivo que permita calcular 
 * la cantidad de d´ıgitos que tiene un n´umero positivo n*/
public class Ej3
{
    int cantidadDigitos(int n){
        int res;
        if(n == 0)
            res = 0;
        else 
            res = cantidadDigitos(n/10)+1;
        return res;
    }
}
