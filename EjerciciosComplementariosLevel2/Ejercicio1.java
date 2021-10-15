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
        char c;
        char cont;
        
        do{//Bucle para repetir el programa
            System.out.println("    Level 2 Ejercicio 1 - Java Informatorio 2021");

            do{ System.out.println("Ingrese una cuidad");
                list.add(scanner.nextLine());
                System.out.println("Para salir de la carga ingrese X o cualquier tecla para seguir");
                try {
                    cont= scanner.nextLine().charAt(0);
                }catch (StringIndexOutOfBoundsException e){//evito la excepcion por si solo presiona enter
                    cont=' ';
                }

            }while(cont!='X');

            System.out.println("Ranking de Ciudades");
            AtomicInteger nro= new AtomicInteger();
            list.forEach((l) -> {
                nro.getAndIncrement();
                System.out.println("#"+ nro+ "- " + l);
            });

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