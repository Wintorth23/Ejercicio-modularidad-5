/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.modu;

/**
 *
 * @author jepeh
 */
public class CambioNotas implements ICambioNotas{

    @Override
    public double cambio(Double[] notas) {
        for (int i = 0; i < notas.length; i++) {
         if(notas[i]< 10){  
          notas[i] = 10.0;
        }       
         
       
    }        
      return CalculoNotas.calcularPromedio(notas);
 } 
}
      
    
    

