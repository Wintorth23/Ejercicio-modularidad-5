/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad_ejm_2;

/**
 *
 * @author jepeh
 */
public class ReporteNomina {
       public static void mostrar(Empleado e, double promedio, boolean aceptable) {
        System.out.println("Empleado: " + e.nombre);
        System.out.println("Sueldo promedio: " + promedio);
        System.out.println("Estado: " + (aceptable ? "ACEPTABLE" : "BAJO"));
    }
}
