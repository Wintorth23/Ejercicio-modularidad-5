/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo5.mod;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Ejemplo5MOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        IEjemplos ej=new CalculoPenalizacion();
        IMostrar ms = new MostrarRegistro();
        double promedioFinal=0;
        
        System.out.println("-------Calculo de un promedio---------");
        System.out.println("Escriba el nombre del estudiente");
            String nombre=sc.nextLine();
        System.out.println("Ingrese el numero de notas a registrar");
            int op= sc.nextInt();
            sc.nextLine();
        
        System.out.println("---------Calculo de Notas--------");
        Double[] notas=new Double[op];
        
        
        for (int i = 0; i < op ; i++) {
            System.out.println("-----Ingrese la Notas: " + (i+1)+"---------");
            notas[i]=sc.nextDouble(); 
        }
        Estudiante e = new Estudiante(nombre,notas);
        double promedioInicial= CalculoPromedio.calculopromedio(e.getNotas());
        boolean aprovado1=CalculoPromedio.aprovado(promedioInicial);
        System.out.println("------Desea Aplicar la Penlaizacion---------");
        System.out.println("Si.1"+"\nNo.2");
        
        int n= sc.nextInt();
        if (n==1){
             promedioFinal= ej.cambio(promedioInicial);
        }else{
             promedioFinal=promedioInicial;
        }
        
        ms.mostrarRegistro(e, promedioFinal , promedioInicial, aprovado1, aprovado1);
            
        
        
        
        
        
    }
    
}
