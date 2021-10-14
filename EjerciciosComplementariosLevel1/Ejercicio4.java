/*Ejercicio 4
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
 */

import java.util.Scanner;
//by SanFosX
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char c;
        String ent1;
        int n1=0;
        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 4 - Java Informatorio 2021");

            do{//Bucle para validar la primer entrada
                System.out.println("Ingrese un valor entero mayor a cero");
                ent1= scanner.nextLine();
                try{
                    n1=Integer.parseInt(ent1);
                }catch(NumberFormatException ex){//Si no ingreso un numero informo
                    System.out.println("No es un número");
                }

            }while (n1<=0);

            if (n1>31){//por el tipo int no calcula factorial para un numero mayor a 31
                System.out.println("OOPS -Programa limitado solo puedo calcular el factorial de un numero menor a 32");
            }else {
                System.out.println("El factorial de " + n1 + " es: " + factorial(n1));
            }

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
    //metodo del factorial recursivo
    private static int factorial(int nro) {
        if (nro <= 1)
            return nro;
        return nro * factorial(nro - 1);
    }
}