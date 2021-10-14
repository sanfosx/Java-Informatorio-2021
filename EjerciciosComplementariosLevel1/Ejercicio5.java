/*Ejercicio 5
Se desea una aplicación que solicite 2 números enteros y realice la operación de
multiplicación por sumas sucesivas (sin uso de librerías).
 */

import java.util.Scanner;
//By SanFosx
public class Ejercicio5 {
    
    public static void main(String[] args) {
        //Defino las variables
        Scanner scanner= new Scanner(System.in);
        char c;
        int n1=0;
        int n2=0;
        String ent1;
        String ent2;


        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 5 - Java Informatorio 2021");

            do{//Bucle para validar la primer entrada
                System.out.println("Ingrese el primer valor entero mayor a cero");
                ent1= scanner.nextLine();
                try{
                    n1=Integer.parseInt(ent1);
                }catch(NumberFormatException ex){//Si no ingreso un numero informo
                    System.out.println("No es un número");
                }

            }while (n1<=0);

            do{//Bucle para validar la segunda entrada
                System.out.println("Ingrese el Segundo valor entero mayor a cero");
                ent2= scanner.nextLine();
                try{
                    n2=Integer.parseInt(ent2);
                }catch(NumberFormatException ex){//Si no ingreso un numero informo
                    System.out.println("No es un número");
                }

            }while (n2<=0);
        
            //Muestro el resultado
            System.out.println("El valor de la multiplicacion de "+ n1 +" * "+ n2 +" es: "+ producto(n1, n2));
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
        

    // funcion que calcula el producto por sumas sucesivas
    private static int producto (int nro1, int nro2){
        int prod=0;
        for (int i = 0; i<nro1 ; i++) {
            prod= prod+nro2;
        }
        return prod;
    }
}
