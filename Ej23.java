/*Se define un n´umero de d´ıgitos incrementales, a todo n´umero natural n = dm ... d1 d0, tal que dı+1
es menor igual que dı. Por ejemplo: 1227, 359, 88, 139 son n´umeros de dgitos incrementales. Escribe un
proceso recursivo para decidir si un n´umero n es un n´umero de d´ıgitos incrementales.�*/
public class Ej23
{
    public boolean numIncrementales(int n){
        return numIncrementales(n/10, n%10);
    }

    private boolean numIncrementales(int n, int ant){
        boolean res;
        if(n <= 0){
            res = true;
        }else{
            if(n%10 <= ant){
                res = numIncrementales(n/10, n%10);
            }else{
                res = false;
            }   
        }
        return res;
    }
}