/*Ejercicio 6
Se desea una aplicación que solicite 2 números enteros y realice la operación de
potencia (sin uso de librerías).
 */

import java.util.Scanner;
//By SanFosX
public class Ejercicio6 {

    public static void main(String[] args) {
        //Defino las variables
        Scanner scanner= new Scanner(System.in);
        char c;
        int n1=0;
        int n2=0;
        String ent1;
        String ent2;


        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 6 - Java Informatorio 2021");

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

            //Muestro el resultado de la potencia
            System.out.println("El valor de la Potencia de "+ n1 +" ** "+ n2 +" es: "+ potencia(n1, n2));
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

    //Funcion que calcula la potencia por multiplicaciones sucesivas
    private static int potencia (int nro1, int nro2){
        int pot=nro1;
        for (int i = 1; i<nro2 ; i++) {
            pot= pot * nro1;
        }
        return pot;
    }
}