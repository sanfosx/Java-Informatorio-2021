/*Ejercicio 7
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
nos devuelva un array de Strings. Con la secuencia de números enteros de principio
a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo
de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nro1, nro2;


        System.out.println("Ingrese el primer valor");

        nro1=scanner.nextInt();

        System.out.println("Ingrese el primer valor");

        nro2=scanner.nextInt();

        System.out.println(fizzBuzzFuncion(nro1,nro2));
        
    }

    private static List<String> fizzBuzzFuncion(int nro1, int nro2) {
        List<String> array1 = new ArrayList<String>();
        for (int j = nro1; j < nro2; j++) {
            if (j%2==0 & j%3==0){
                array1.add("FizzBuzz");
            }else if(j%2==0){
                array1.add("Fizz");
            }else if(j%3==0){
                array1.add("Buzz");
            }else array1.add(String.valueOf(j));
        }
        return array1;
    }
}