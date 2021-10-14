/*Ejercicio 9
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
 */

import java.util.Scanner;
//By SanFosX
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        char c;
        char ctrl;

        do{//Bucle para repetir el programa
            System.out.println("    Level 1 Ejercicio 9 - Java Informatorio 2021");
            int contPal=0;
            System.out.println("Ingrese un Texto");
            text = scanner.nextLine();
            System.out.println("Ingrese la letra que desea contar");
            ctrl = scanner.nextLine().charAt(0);

            //Cuento la cuantas veces aparece la letra solicitada
            for (int n = 0; n <text.length (); n++) {

                if(text.charAt(n) == ctrl){
                contPal++;
                }
            }
            if(contPal==0){
                System.out.print("No hay letras " + ctrl + " en el texto ingresado");

            }else System.out.print("Cantidad de Letras " + ctrl + " = "+ contPal);

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