/*Se dice que n es un n´umero que explota, cuando ´este explota en varios fragmentos m´as chicos que ´el, dada
una bomba. Si se tiene que n es el numero y b la bomba, tales que n es mayor que b, se puede hacer que n
explote en dos numeros n1 = n / b y n2 = n - (n/b). Pero b es una bomba que produce una reacci´on en
cadena, si n1 o n2 son mayores que b, ´estos tambi´en explotan con la regla anterior, hasta que se encuentre
que el numero no es mayor que b, entonces se dice que ya no se puede explotar el numero. Por ejemplo, si
n = 10 y b = 3, entonces n explota en los pedazos: 3,2,1,1 y 3. Escribe un proceso que permita mostrar
los pedazos del numero n, dado que se tiene la bomba b.*/
import java.util.ArrayList;
public class Ej16
{
    public ArrayList explotar(int n, int bomba){
        return explotar(n, bomba, new ArrayList());
    }

    private ArrayList explotar(int n, int bomba, ArrayList<Integer> lista){
        int n1 = n/bomba;
        int n2 = n - (n/bomba);
        if((n1 <= bomba) && (n2 <= bomba)){
            lista.add(n1);
            lista.add(n2);
            return lista;
        }else{
            if(n1 > bomba){
                return explotar(n1, bomba, lista);
            }else{
                lista.add(n1);
            }
            if(n2 > bomba){
                return explotar(n2, bomba, lista);
            }else{
                lista.add(n2);
            }
            return lista;
        }
    }
}
