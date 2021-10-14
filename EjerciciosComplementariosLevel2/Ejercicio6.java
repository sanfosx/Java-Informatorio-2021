/*Ejercicio 6
Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio6 {



    public static void main(String[] args) {
        List<Empleados> arrayEmp = new ArrayList<Empleados>();

        arrayEmp.add(new Empleados("santiago",30323715,8,800));
        arrayEmp.add(new Empleados("pedro",30323716,7,700));
        arrayEmp.add(new Empleados("pep",30323726,6,600));
        arrayEmp.add(new Empleados("hernan",30323745,5,500));
        arrayEmp.add(new Empleados("juan",30323788,4,350));
        arrayEmp.add(new Empleados("thiago",30323741,10,950));
        arrayEmp.add(new Empleados("daniel",30323720,3,250));



    }
}
