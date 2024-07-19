/*Considera el anterior ejercicio, pero ad´aptalo para decidir si un n´umero natural n, es un n´umero de d´ıgitos
decrementales.*/
public class Ej24
{
    public boolean numDecrementales(int n){
        return numDecrementales(n/10, n%10);
    }
    
    private boolean numDecrementales(int n, int ant){
        boolean res;
        if(n <= 0){
            res = true;
        }else{
            if(n%10 >= ant){
                res = numDecrementales(n/10, n%10);
            }else{
                res = false;
            }   
        }
        return res;
    }
}
