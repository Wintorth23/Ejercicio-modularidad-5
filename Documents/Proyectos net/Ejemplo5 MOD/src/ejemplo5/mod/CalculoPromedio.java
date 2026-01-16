/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo5.mod;

/**
 *
 * @author jepeh
 */
public class CalculoPromedio {
    public static double calculopromedio (Double[] notas){
        double suma = 0;
        for (int i = 0; i <notas.length ; i++) {
            suma+=notas[i];
                                 
        }
       return suma / notas.length; 
    }
    
    public static boolean aprovado(double promedio){
        return promedio >= 14;
       
    }
    
}
