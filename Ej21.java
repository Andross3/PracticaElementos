/*Implementar una soluci´on recursiva que calcule la suma de los primeros n n´umeros pares que no son
m´ultiplos de 4.*/
public class Ej21
{
    //sumar los primeros numeros que no son multiplos de 4
    public int sumar(int n){
        return sumar(0, n);
    }

    private int sumar(int i, int n){
        int res;
        if(i == n)
            res = 0;
        else{
            if(i % 2 == 0){
                if(i % 4 == 0){
                    res = sumar(i+1, n);
                }
                else
                    res = i + sumar(i+1, n);
            }else
                res = sumar(i+1, n);
        }
        return res;
    }
}
