/*Escribe un metodo que permita saber si todos los 
 * dıgitos de un numero n, son pares.*/
public class Ej14
{
    public boolean sonPares(int n){
        boolean res;
        if(n == 0){
            res = true;
        }else{
            if((n%10)%2 == 0){
                res = sonPares(n/10);
            }else{
                res = false;
            }
        }
        return res;
    }
}
