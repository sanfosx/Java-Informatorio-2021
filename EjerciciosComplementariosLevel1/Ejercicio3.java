/*Ejercicio 3
Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1)
 */

import java.util.Scanner;
//By SanFosX
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        char c;
        String ent1;
        int n1=0;

        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 3 - Java Informatorio 2021");

            do{//Bucle para validar la primer entrada
                System.out.println("Ingrese un valor Entero mayor a cero");
                ent1= scanner.nextLine();
                try{
                    n1=Integer.parseInt(ent1);
                }catch(NumberFormatException ex){//Si no ingreso un numero informo
                    System.out.println("No es un número");
                }

            }while (n1<=0);
        
            //Imprimo la secuencia
            for(int j=0;j<=n1+1;j++){
                for (int i = 1; i < j; i++){
                    System.out.print(i);

                }
                System.out.println();
                
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
}
