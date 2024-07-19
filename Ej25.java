/*Definimos inverso simple de una secuencia de caracteres, al inverso de la secuencia sin sus repeticiones
consecutivas. Por ejemplo, el inverso simple de aaabccdddaaebb es beadcba. Escribe un proceso recursivo
para obtener el inverso simple de una secuencia de caracteres.*/
public class Ej25
{
    public String inverso(String cad){
        return inverso(cad, cad.charAt(cad.length()-1), cad.length()-1, cad.length()-1);   
    }

    private String inverso(String cad, char ant, int posLetra, int i){
        String res;
        if(posLetra == 0){
            res = "" + cad.charAt(posLetra);
        }else{
            if(ant == cad.charAt(i)){
                posLetra = posLetra - 1;
                res = "" + inverso(cad, cad.charAt(posLetra), posLetra, i);
            }else{        
                res = cad.charAt(i) + inverso(cad, cad.charAt(posLetra), posLetra-1, posLetra);
            }
        }
        return res;
    }
}
