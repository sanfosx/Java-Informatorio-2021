/*Ejercicio 1
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!
*/

import java.util.Scanner;
//by SanFosX
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        char c;

        do{//Bucle para repetir el programa
            
            System.out.println("    Level 1 Ejercicio 1 - Java Informatorio 2021");

            
            System.out.println("Ingrese su nombre de usuario");
        
            String user= scanner.nextLine();

            System.out.println("        HOLA "+ user + "!!!");
            System.out.println();

            System.out.println("Presione N para salir o cualquier otra tecla para repetir el programa");
            try {
                c=scanner.nextLine().charAt(0);
            }catch (StringIndexOutOfBoundsException e){//evito la excepcion por si solo presiona enter
                c=' ';
            }
            System.out.println();
        }while(c!='N');
        scanner.close();
        System.out.println("Saludos");            

    }
}