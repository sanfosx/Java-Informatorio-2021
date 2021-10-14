/*Ejercicio 5
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
del resumen de carga de horas semanal de un empleado. Se debe generar otra lista
que contenga los totales y luego imprimir el total final a cobrar.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<Integer>();
        List<Integer> array2 = new ArrayList<Integer>();
        List<Integer> arrayTot = new ArrayList<Integer>();
        array1.add(6);
        array1.add(7);
        array1.add(8);
        array1.add(4);
        array1.add(5);

        array2.add(350);
        array2.add(345);
        array2.add(550);
        array2.add(600);
        array2.add(320);
        int tot=0;
        for (int i = 0; i <5; i++) {
            arrayTot.add(i,(array1.get(i) * array2.get(i)));
            tot= tot + arrayTot.get(i);
        }

        System.out.println("Horas trabajadas");
        array1.forEach((l) -> {
            System.out.print(l + "hs ");
        });
        System.out.println();
        System.out.println("Precio x horas trabajadas");
        array2.forEach((l) -> {
            System.out.print("$"+l+ " ");
        });
        System.out.println();
        System.out.println("totales x dia");
        arrayTot.forEach((l) -> {
            System.out.print("$"+l+ " ");
        });
        System.out.println();
        System.out.println("Monto a cobrar");
        System.out.print("$" + tot);
    }
}