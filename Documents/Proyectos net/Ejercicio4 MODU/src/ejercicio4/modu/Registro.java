/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.modu;

/**
 *
 * @author jepeh
 */

public class Registro implements IRegistro{

    @Override
    public void mostrar(Estudiante es, double promedioInicial, double promedioFinal, boolean aprovado1,boolean aprovado2) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     System.out.println("---------Datos obtenidos---------");
        System.out.println("Nombre: "+ es.getNombre());
        System.out.println("PromedioInicial: "+promedioInicial);
        System.out.println("PromedioFinal: "+promedioFinal);
        System.out.println("Estado: "+(aprovado1 ? "Aprobado" : "Reprobado"));
        System.out.println("Estado: "+(aprovado2 ?  "Aprobado" : "Reprobado"));
        System.out.println("-------Fin de mostrar datos---------");
    }
    
}
