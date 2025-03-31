/*Definimos numero promedio de un numero entero positivo, al numero que se obtiene de sumar sus digitos
de posiciones pares y restar sus dıgitos de posiciones impares. Escribir un planteo recursivo para obtener
el numero promedio de un entero positivo dado. Ej.: el numero promedio de 318547 es -2 pues -3+1-8+5-
4+7= -2.
 */
public class Ej18
{
    public int promedio(int n){
        int res = 0;
        int limite = contarDigitos(n);
        int exponente = limite - 1;
        int posicion = 0;
        return promedio(n, exponente, posicion, limite, res);
    }
    private int promedio(int n, int exponente, int cambio, int limite, int res){
        int divisor = potencia(10, exponente); 
        if(limite > 0){
            if(cambio == 0){
                //Posicion Impar
                res = res - (n / divisor);
                return promedio(n % divisor, exponente - 1, 1, limite-1, res);
            }else{
                //posicion par
                res = res + (n / divisor);
                return promedio(n % divisor, exponente - 1, 0, limite-1, res);
            }   
        }else{
            return res;
        }
    }
    
    public int contarDigitos(int n){
        n = Math.abs(n);
        if(n > 0){
            return contarDigitos(n/10)+1;   
        }else{
            return 0;
        }
    }
    
    private int potencia(int n, int k){
        if(k <= 0){
            return 1;
        }else{
            return n * potencia(n, k - 1);
        }
    }
}
