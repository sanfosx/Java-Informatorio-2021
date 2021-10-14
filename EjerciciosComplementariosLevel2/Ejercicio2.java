/*Ejercicio 2
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio
de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el
tamaño de la misma (antes y después de agregar en la primera y última posición).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        int cant= list.size();
        list.add(0,42);
        list.add(42);

        AtomicInteger nro= new AtomicInteger();
        list.forEach((l) -> {
            nro.getAndIncrement();
            System.out.println(l);

        });
        System.out.println("Tamaño inicial " + cant);
        System.out.println("Tamaño final " + list.size());
    }
}