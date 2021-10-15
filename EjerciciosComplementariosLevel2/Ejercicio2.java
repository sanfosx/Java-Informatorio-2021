/*Ejercicio 2
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio
de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el
tamaño de la misma (antes y después de agregar en la primera y última posición).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import org.graalvm.compiler.asm.amd64.AMD64Address.Scale;
//By SanFosX
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char c;

        do{//Bucle para repetir el programa
            System.out.println("    Level 2 Ejercicio 2 - Java Informatorio 2021");

            List<Integer> list = new ArrayList<Integer>();
            list.add(23);
            list.add(23);
            list.add(23);
            list.add(23);
            list.add(23);
            int cant= list.size();
            list.add(0,42);
            list.add(42);

            System.out.println("Impresion de la Lista");
            list.forEach((l) -> {
                System.out.println(l);

            });
            System.out.println();
            System.out.println("Tamaño inicial " + cant);
            System.out.println("Tamaño final " + list.size());
        
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