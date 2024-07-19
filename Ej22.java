/*Escribir un proceso recursivo que muestre una media pir´amide de d´ıgitos como se muestra en la siguiente
figura:
1
21
321
4321
54321
654321
7654321
87654321
987654321*/
public class Ej22
{
    public void generarPiramide(int n){
        generarPiramide(1, n, 1, 1, 1); 
    }
    
    private void generarPiramide(int cont, int altura, int ancho, int x, int y){
        if(y <= altura){
            if(x <= ancho){
                System.out.print(cont);
                generarPiramide(cont-1, altura, ancho, x+1, y);
            }else{
                System.out.println();
                generarPiramide(y+1, altura, ancho+1, 1, y+1);
            }
        }
    }
}
