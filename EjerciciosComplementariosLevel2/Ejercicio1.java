/*Ejercicio 1
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String cont= "S";
        while (!cont.equals("N")){
            System.out.println(cont);
            System.out.println("Ingrese una cuidad");
            list.add(scanner.nextLine());
            System.out.println("Para salir de la carga ingrese N o cualquier tecla para seguir");
            cont= scanner.nextLine();
        }

        System.out.println("Ranking de Ciudades");
        AtomicInteger nro= new AtomicInteger();
        list.forEach((l) -> {
            nro.getAndIncrement();
            System.out.println("#"+ nro+ "- " + l);
        });
    }
}