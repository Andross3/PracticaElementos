/*Escribir una soluci´on recursiva que calcule la funci´on de Ackerman para valores de m y n dados. La funci´on
de Ackerman se describe del siguiente modo:
A(m, n) = n + 1, si m = 0
A(m, n) = A(m-1, 1), si n = 0
A(m,n) = A(m-1, A(m,n-1)), si m es mayor que 0 y n es mayor que 0�
   */
public class Ej19
{
    public int Ackerman(int m, int n){
        int res;
        if(m == 0){
            res = n +1;
        }
        else{
            if(n == 0){
                res = Ackerman(m-1, 1);
            }else{
                res = Ackerman(m-1, Ackerman(m, n-1));
            }
        }
        return res;
    }
}
