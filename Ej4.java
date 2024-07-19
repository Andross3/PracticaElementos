import java.util.ArrayList;
/*Se desea encontrar los factores primos de un numero n.
   */
public class Ej4
{
    public ArrayList factoresPrimos(int n){
        return factoresPrimos(n, 2, new ArrayList<Integer>());
    }

    public ArrayList factoresPrimos(int n, int i, ArrayList<Integer> factores){
        if(n == 1){
            return factores;
        }else{
            Ej2 primo = new Ej2();
            if(primo.esPrimo(i)){
                if(n % i == 0){
                    factores.add(i);
                    if(n%i == 0){
                        return factoresPrimos(n/i, i, factores);
                    }else{
                        return factoresPrimos(n/i, i+1, factores);
                    }
                }else{
                    return factoresPrimos(n, i+1, factores);
                }
            }else{
                return factoresPrimos(n, i+1, factores);
            }
            /*
            if(n % i == 0){
                //Ej2 primo = new Ej2();
                if(primo.esPrimo(i)){
                    factores.add(i);
                }

                if(n%i == 0){
                    return factoresPrimos(n/i, i, factores);
                }else{
                    return factoresPrimos(n/i, i+1, factores);
                }

            }else{
                return factoresPrimos(n, i+1, factores);
            }*/
        }
    }
}
