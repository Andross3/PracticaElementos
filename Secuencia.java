import java.util.Random;
public class Secuencia
{
    /**5. secuencia de numeros*/
    public int[] generar(int n){
        int vector[] = new int[n];
        Random r = new Random();
        for(int i = 0;i < n; i++){
            vector[i] = r.nextInt(100)+1;
        }
        return vector;
    }

    /**6. sumar elementos de una secuencia*/
    public int suma(int vector[]){
        return suma(vector, 0, 0);
    }
    private int suma(int vector[], int res, int pos){
        if(pos == vector.length){
            return res;
        }else{
            return suma(vector, res+vector[pos], pos+1);
        }
    }

    /**7. encontrar el minimo numero de la secuencia*/
    public int minimo(int vector[]){
        ordenar(vector);
        return vector[0];
    }

    /**8. ordenar la secuencia*/
    public void ordenar(int vector[]){
        if(vector.length == 1){

        }else{
            ordenar(vector, 1, 0, 1);
        }
    }
    private void ordenar(int vector[], int fin, int pA, int pB){
        /*if(puntero < vector.length && limite >= 0){
        if(vector[puntero] <= vector[limite]){
        vector[puntero] = vector[puntero] + vector[limite];
        vector[limite] = vector[puntero] - vector[limite];
        vector[puntero] = vector[puntero] - vector[limite];
        ordenar(limite-1, puntero-1);
        }else{
        ordenar(limite+1, puntero+1);
        }
        }*/
        if(fin < vector.length){
            if(pA >= 0){
                if(vector[pB] <= vector[pA]){
                    vector[pB] = vector[pB] + vector[pA];
                    vector[pA] = vector[pB] - vector[pA];
                    vector[pB] = vector[pB] - vector[pA];
                    ordenar(vector, fin, pA-1, pB-1);
                }
                ordenar(vector, fin+1, pA+1, pB+1);
            }
        }
    }

    /**9. buscar un elemento*/
    public boolean buscar(int vector[], int n){
        if(vector.length > 0){
            return buscar(vector, n, 0, vector.length, vector.length/2);
        }else{
            if(n == vector[0])
                return true;
            else
                return false;
        }
    }
    private boolean buscar(int vector[], int n, int ini, int fin, int med){
        boolean res;
        if(fin >= ini && ini < vector.length){
            med = ini +(fin-ini)/2;
            if(vector[med] == n){
                res = true;
            }else if(vector[med] > n){
                res = buscar(vector, n, ini, med-1, med);
            }else{
                res = buscar(vector, n, med+1, fin, med);
            }
        }else{
            res = false;
        }
        return res;
    }
    /**10. hacer un functor*/
    public void functor(){}
    /**11. sumar una secuencia con otra secuencia*/
    public int[] sumarOtraSecuencia(int secuencia[], int secuencia2[]){
        if(secuencia.length == secuencia2.length){
            return sumarOtraSecuencia(secuencia, secuencia2, new int[secuencia.length], 0);
        }else{
            return null;
        }
    }
    private int[] sumarOtraSecuencia(int secuencia[], int secuencia2[], int nuevo[], int pos){
        if(pos == secuencia.length){
            return nuevo;
        }else{
            nuevo[pos] = secuencia[pos] + secuencia2[pos];
            return sumarOtraSecuencia(secuencia, secuencia2, nuevo, pos+1);
        }
    }
    /**12. producto escalar*/
    public int productoEscalar(int vector1[], int vector2[]){
        if(vector1.length == vector2.length){
            return productoEscalar(vector1, vector2, new int[vector2.length],0, 0);
        }else{
            return -1;
        }
    }
    private int productoEscalar(int vector1[], int vector2[], int nuevo[],int pos, int change){
        int res;
        if(pos == vector1.length && change == 1){
            res = suma(nuevo);
        }else{
            if(pos < vector1.length){
                nuevo[pos] = vector1[pos]*vector2[pos];
                res = productoEscalar(vector1, vector2, nuevo, pos+1, change);
            }else{
                res = productoEscalar(vector1, vector2, nuevo, pos, 1);
            }
        }
        return res;
    }
    
    /**13. sumar primos*/
    public int sumaPrimos(int vector[]){
        return sumaPrimos(vector, 0, 0);
    }
    private int sumaPrimos(int vector[], int pos, int res){
        if(pos == vector.length){
            return res;
        }else{
            Ej2 primo = new Ej2();
            if(primo.esPrimo(vector[pos])){
                res = res + vector[pos];
            }
            return sumaPrimos(vector, pos+1, res);
        }
    }
}
