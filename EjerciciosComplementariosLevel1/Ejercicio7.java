/*Ejercicio 7
Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
Sin uso de métodos o librerías que realicen toUppercase().
 */

import java.util.Scanner;
//By SanFosX
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ctrl;
        String text;

        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 7 - Java Informatorio 2021");
            System.out.println("Ingrese una Palabra o Texto");
            text = scanner.nextLine();
            System.out.println();
            System.out.println("Texto en Mayusculas:");
            for (int n = 0; n <text.length (); n++) {
                char c;
                if(text.charAt(n)!=' '){
                    c = (char) (text.charAt (n) & 0x5f);
                }else {
                    c = text.charAt (n);
                }
                System.out.print(c);
            }

            System.out.println();
            System.out.println("Presione N para salir o cualquier otra tecla para repetir el programa");
            try {
                ctrl=scanner.nextLine().charAt(0);
            }catch (StringIndexOutOfBoundsException e){//evito la excepcion por si solo presiona enter
                ctrl=' ';
            }

        }while(ctrl!='N');
        scanner.close();
        System.out.println("Saludos");
    
    }
}