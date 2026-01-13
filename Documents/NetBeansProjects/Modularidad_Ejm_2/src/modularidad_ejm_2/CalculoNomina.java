package modularidad_ejm_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jepeh
 */
public class CalculoNomina {
      public static double calcularPromedio(double[] sueldos) {
        double suma = 0;
        for (int i = 0; i < sueldos.length; i++) {
            suma = suma + sueldos[i];
        }
        return suma / sueldos.length;
    }

    public static boolean sueldoAceptable(double promedio) {
        return promedio >= 500;
    }

    // Paso por valor
    public static double aplicarBono(double promedio) {
        return promedio + 50;
    }
}
