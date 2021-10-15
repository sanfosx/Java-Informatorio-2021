/*Ejercicio 5
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
del resumen de carga de horas semanal de un empleado. Se debe generar otra lista
que contenga los totales y luego imprimir el total final a cobrar.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//By SanFosX
public class Ejercicio5 {

    public static void main(String[] args) {

        List<Integer> array1 = new ArrayList<Integer>();
        List<Integer> array2 = new ArrayList<Integer>();
        List<Integer> arrayTot = new ArrayList<Integer>();
        Scanner scanner= new Scanner(System.in);
        char c;

        do{//Bucle para repetir el programa
            System.out.println("    Level 2 Ejercicio 5 - Java Informatorio 2021");

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


            System.out.println();
            System.out.println("Presione N para salir o cualquier otra tecla para repetir el programa");
            try {
                c=scanner.nextLine().charAt(0);
            }catch (StringIndexOutOfBoundsException e){//evito la excepcion por si solo presiona enter
                c=' ';
            }

        }while(c!='N');
        scanner.close();
        System.out.println("Saludos");
    }
}