package Clases;
//PASO 1:
/* RECURSIVIDAD: en programacion es una tecnica la cual permite que un
bloque de instrucciones codificadas se ejecute  "n" veces.
En JAVA los métodos pueden llamarse a si mismos,
esto es posible cuando dentro de un metodo existe la invicacion
a si mismo, y de esta manera se considera que es emetodo es recursivo.
 */

public class Recursividad {

    public void imprimir (int x){

        if(x <= 30){

            System.out.print(x + " ");

            imprimir(x+1);
        }
    }
}
// Recursividad Controlada podemos reemplazar el 30 dentro del IF ( que es hasta el numero que se va a contar)
// En esta pantalla el valor de x me determina de cuanto en cuanto va a contar nuestro programita.