public class Ej15
{
    /*Escribe un proceso recursivo que permita decidir si un numero natural n es divisible entre 11. Dado que
    se sabe que un numero es divisible entre 11, si y solo si la suma de los digitos de posici´on par menos la
    suma de los d´ıgitos de posici´on impar es un m´ultiplo de 11. Por ejemplo: sea n = 2341675, entonces (5 +
    6 + 4 + 2) - (7 + 1 + 3) = 6, que no es m´ultiplo de 11, por lo tanto n no es divisible entre 11.�*/
    public boolean esDivisible(int n){
        if((esDivisible(n, 0, 0, 0) % 11) == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private int esDivisible(int n, int change, int par, int impar){
        int res;
        if(n == 0){
            res = par - impar;
        }else{
            if(change == 0){
                res = esDivisible(n/10, 1, par+(n%10), impar);
            }else{
                res = esDivisible(n/10, 0, par, impar+(n%10));
            }
        }
        return res;
    }
}
