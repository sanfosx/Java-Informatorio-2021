/*Ejercicio 3
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos
(3 arrayList) e imprimir dichos cursos.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//By SanFosX
public class Ejercicio3 {

    public static void main(String[] args) {
        List<String > list = new ArrayList<String>();
        String palo = null;
        Scanner scanner= new Scanner(System.in);
        char c;

        do{//Bucle para repetir el programa
            System.out.println("    Level 2 Ejercicio 3 - Java Informatorio 2021");
            for (int j = 0; j <4 ; j++) {
                
                for (int i = 1; i < 14; i++) {
                    switch (j) {
                        case 0:
                            palo="Trebol";
                            break;
                        case 1:
                            palo="Diamante";
                            break;
                        case 2:
                            palo="Pika";
                            break;
                        case 3:
                            palo="Cororazon";
                            break;
                    }
                    list.add(String.valueOf(i) + "-"+ palo);
                }
            }
            System.out.println();
            System.out.println("Baraja ordenada");
            list.forEach(System.out::println);
            System.out.println();
            System.out.println("Baraja en reversa");
            Collections.reverse(list);
            list.forEach(System.out::println);
            System.out.println();
            System.out.println("Baraja desordenada");
            Collections.shuffle(list);
            list.forEach(System.out::println);

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