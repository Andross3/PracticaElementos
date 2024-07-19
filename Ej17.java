/*Dado una cadena c, escribir procesos recursivos para resolver cada uno de los siguientes problemas:
a) Contar la cantidad de veces que aparece un car´acter x en c. Ej: para c = “elementos de programaci´on”
y x =‘e‘, el resultado es 4.
b) Generar una cadena c1 equivalente a la cadena c, pero invertida. Ej: para c =“comer” el resultado
es c1 = “remoc”.
c) Contar la cantidad de vocales que tiene c. Ej: para c = “elementos de programacion”, el resultado
es 10.*/
import java.util.ArrayList;
public class Ej17{
    ArrayList<Character> vocales = new ArrayList<Character>()
    {
        {add('a');
         add('e');
         add('i');
         add('o');
         add('u');}
    };
    
    public int cantCaracter(String c, char x){
        return cantCaracter(0, c, x);
    }
    private int cantCaracter(int i, String c, char x){
        int cont;
        if(i >= c.length()){
            cont = 0;
        }else{
            if(x == c.charAt(i))
                cont = cantCaracter(i+1, c, x)+1;
            else
                cont = cantCaracter(i+1, c, x);
        }
        return cont;
    }
    
    public String invertirCadena(String cad){
        return invertirCadena(0, cad);
    }
    private String invertirCadena(int i, String cad){
        String res;
        if(i == cad.length()-1){
            res = "" + cad.charAt(i);
        }else{
            res = invertirCadena(i+1, cad)+cad.charAt(i);
        }
        return res;
    }
    
    public int cantVocales(String cadena){
        return cantVocales(cadena, 0);
    }
    private int cantVocales(String cadena, int i){
        if(i == cadena.length()){
            return 0;        
        }else{
            if(vocales.contains(cadena.charAt(i))){
                return 1 + cantVocales(cadena, i+1);
            }else{
                return cantVocales(cadena, i+1);
            }
        }
    }
}
