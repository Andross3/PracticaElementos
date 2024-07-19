/*Escribe un proceso recursivo que permita 
 decidir si un n´umero natural n es primo o no.*/
public class Ej2
{
    boolean esPrimo(int n){
        if(n == 1){
            return true;
        }else if(n == 0){
            return false;
        }else{
            return esPrimo(n, n-1);
        }
    }

    private boolean esPrimo(int n, int i){
        boolean res;
        if(i == 1){
            res = true;
        }else{
            if(n%i == 0){
                res = false;
            }else{
                res = esPrimo(n, i-1);    
            }
        }
        return res;
    }
}
