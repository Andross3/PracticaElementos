/*Escribir un proceso recursivo para reconocer si una cadena dada es de la forma anbn; es decir n a’s
consecutivas seguidas de n b’s consecutivas.
**/
public class Ej26
{
    public String letrasConsecutivas(String cadena){
        if(cadena.length() == 1){
          return cadena.charAt(0)+"1";
        }
        return letrasConsecutivas(cadena, ""+cadena.charAt(0), 0, 0, cadena.length(),"");
    }
    private String letrasConsecutivas(String cadena, String letra, int cont, int pos, int tamCadena, String res){
        if(pos == tamCadena){ 
                return res + letra + cont;
        }else{
            String aux = ""+cadena.charAt(pos);
            if(letra.equals(aux)){
                //Contar las letras iguales
                return letrasConsecutivas(cadena, letra, cont+1, pos+1, tamCadena, res);    
            }else{
                //Mover a la siguiente letra distinta
                return letrasConsecutivas(cadena, cadena.charAt(pos)+"", 0, pos, tamCadena, res + letra + cont);
            }
        }
    }
}
