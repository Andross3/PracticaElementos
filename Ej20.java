/*Escribir una soluci´on recursiva que retorne verdadero si una palabra es un pal´ındromo (una palabra es
pal´ındromo cuando puede leerse igual de izquierda a derecha que de derecha a izquierda).*/
public class Ej20
{
    public boolean esPalindromo(String cad){
        return esPalindromo(cad, 0, cad.length()-1, cad.length()/2);
    }

    private boolean esPalindromo(String cad, int i, int j, int med){
        boolean res;
        if(i == med){
            res = true;
        }else{
            if(cad.charAt(i) == cad.charAt(j)){
                res = esPalindromo(cad, i+1, j-1, med); 
            }else{
                res = false;
            }
        }
        return res;
    }
}
