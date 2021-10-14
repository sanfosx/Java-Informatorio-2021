/*Ejercicio 2
Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma,
resta, multiplicación, división y módulo (resto de la división) de ambos números.
 */

import java.util.Scanner;
//by SanFosX
public class Ejercicio2 {
    
    public static void main(String[] args) {

        //Defino las variables
        Scanner scanner= new Scanner(System.in);
        char c;
        int n1=0;
        int n2=0;
        String ent1;
        String ent2;


        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 2 - Java Informatorio 2021");

            do{//Bucle para validar la primer entrada
                System.out.println("Ingrese el primer valor entero mayor a cero");
                ent1= scanner.nextLine();
                try{
                    n1=Integer.parseInt(ent1);
                }catch(NumberFormatException ex){//Si no ingreso un numero informo
                    System.out.println(":( No es un número");
                    System.out.println();
                }

            }while (n1<=0);

            do{//Bucle para validar la segunda entrada
                System.out.println("Ingrese el Segundo valor entero mayor a cero");
                ent2= scanner.nextLine();
                try{
                    n2=Integer.parseInt(ent2);
                }catch(NumberFormatException ex){//Si no ingreso un numero informo
                    System.out.println(":( No es un número");
                    System.out.println();
                }

            }while (n2<=0);
            System.out.println("RESULTADOS");//Muestro lo solicita en el ejercicio
            System.out.println("    Suma: "+ n1+ " + "+ n2 + " = " + (n1+n2));
            System.out.println("    Resta: "+ n1+ " - "+ n2 + " = " + (n1-n2));
            System.out.println("    Multiplicacion: "+ n1+ " * "+ n2 + " = " + (n1*n2));
            System.out.println("    Division: "+ n1+ " / "+ n2 + " = " + (n1/n2));
            System.out.println("    Modulo: "+ n1+ " % "+ n2 + " = " + (n1%n2));
            System.out.println();

            System.out.println("Presione N para salir o cualquier otra tecla para repetir el programa");
            try {
                c=scanner.nextLine().charAt(0);
            }catch (StringIndexOutOfBoundsException e){//evito la excepcion por si solo presiona enter
                c=' ';
            }

            n1=0;
            n2=0;
        }while(c!='N');
        scanner.close();
        System.out.println("Saludos");
    }


}