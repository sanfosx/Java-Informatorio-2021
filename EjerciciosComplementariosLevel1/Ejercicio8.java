/*Ejercicio 8
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//By SanFosX
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        char c;

        do{//Bucle para repetir el programa
            List<String> list = new ArrayList<String>();
            System.out.println("    Level 1 Ejercicio 8 - Java Informatorio 2021");
            System.out.println("Nombre y Apellido");
            list.add(scanner.nextLine());

            System.out.println("Edad");
            list.add(scanner.nextLine());
            System.out.println("Direccion");
            list.add(scanner.nextLine());

            System.out.println("Ciudad");
            list.add(scanner.nextLine());
            System.out.println();

            System.out.println("SALIDA");//Muestro lo solicitado
            Collections.reverse(list);
            System.out.println(list);
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
