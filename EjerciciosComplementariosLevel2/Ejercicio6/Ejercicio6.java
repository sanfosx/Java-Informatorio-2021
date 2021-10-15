/*Ejercicio 6
Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map(o
Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.*/

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.function.BiConsumer;
//By SanFosX
public class Main {

    public static void main(String[] args) {

        List<Empleados> arrayEmp = new ArrayList<Empleados>();
        Map<Integer, Integer> mapEmp = new HashMap<Integer, Integer>();

        Scanner scanner = new Scanner(System.in);
        char c;
        char ctrl;
        String nomyap;
        int hsTrab;
        int dni;
        int valXhs;
        String validar;
        String validar_dni;

        do{//Bucle para repetir el programa
            System.out.println("    Level 2 Ejercicio 6 - Java Informatorio 2021");


            do{
                System.out.println("CARGA DE DATOS DE EMPLEADOS");
                Empleados emp= new Empleados();
                System.out.println();

                do {
                    System.out.println("Ingrese Nombre y Apellido");
                    emp.setNomyap(scanner.nextLine());
                    if(emp.getNomyap().length()<=6){
                        System.out.println("Minimo 6 caracteres");
                    }
                }while (emp.getNomyap().length()<=6);

                do {//valido que sea un DNI correcto solo numeros y 8 digitos.-
                    System.out.println("Ingrese DNI 8 digitos");
                    validar=scanner.nextLine();

                    try {
                        emp.setDni(Integer.valueOf(validar));

                    }catch (NumberFormatException e){//evito la excepcion por si solo presiona enter
                        System.out.println("Solo debe ingresar Numeros");
                    }

                }while(validar.length()!=8);


                do {//valido las horas trabajadas que sea un numero mayor o igual a cero

                    System.out.println("Ingrese las Horas Trabajadas");
                    validar=scanner.nextLine();

                    try {
                        emp.setHoraTrabaj(Integer.valueOf(validar));
                    }catch (NumberFormatException e){//evito la excepcion por si solo presiona enter
                        System.out.println("debe ingresar un Numero entero mayor a cero");
                    }

                }while (emp.getHoraTrabaj() <=0);

                do {
                    valXhs=0;
                    System.out.println("Ingrese el Valor por Hora");
                    validar=scanner.nextLine();
                    try {

                        emp.setValorXhora(Integer.valueOf(validar));
                    }catch (NumberFormatException e){//evito la excepcion por si solo presiona enter
                        System.out.println("debe ingresar un Numero entero mayor a cero");
                    }

                }while(emp.getValorXhora() <=0);

                arrayEmp.add(emp);
                System.out.println("se cargaron los datos correctamente");

                System.out.println("Presione X para salir de la carga u otra tecla para continuar cargando Empleados");
                try {
                    ctrl=scanner.nextLine().charAt(0);
                }catch (StringIndexOutOfBoundsException e){//evito la excepcion por si solo presiona enter
                    ctrl=' ';
                }
            }while (ctrl!='X');
            //cargo el diccionario
            arrayEmp.forEach((emp) -> {
                mapEmp.put(emp.dni,(emp.horaTrabaj* emp.valorXhora));
            });
            //muestro los valores
            System.out.println("Lista de Sueldos a pagar por DNI");
            mapEmp.forEach((k,v) -> {
                System.out.println(k + " - $: "+ v);
            });

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