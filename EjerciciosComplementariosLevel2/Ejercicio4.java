/*Ejercicio 4
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos
(3 arrayList) e imprimir dichos cursos.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//By SanFosX
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char c;

        do{//Bucle para repetir el programa
            System.out.println("    Level 2 Ejercicio 4 - Java Informatorio 2021");

                List<String> list = new ArrayList<String>();
                List<String> curso1;
                List<String> curso2;
                List<String> curso3;
                list.add("juan");
                list.add("pedro");
                list.add("pepe");
                list.add("lucas");
                list.add("carlos");
                list.add("hernan");
                list.add("andres");
                list.add("jorge");
                list.add("santiago");
                list.add("daniel");
                list.add("damian");
                list.add("sergio");

                curso1=list.subList(0,4);
                curso2=list.subList(4,8);
                curso3=list.subList(8,12);

                System.out.println("Todos los Estudiantes");
                list.forEach((l) -> {
                    System.out.println(l);
                });

                System.out.println();
                System.out.println("Estudiantes Curso 1");
                curso1.forEach((l) -> {
                    System.out.println(l);
                });

                System.out.println();
                System.out.println("Estudiantes Curso 2");
                curso2.forEach((l) -> {
                    System.out.println(l);
                });

                System.out.println();
                System.out.println("Estudiantes Curso 3");
                curso3.forEach((l) -> {
                    System.out.println(l);
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