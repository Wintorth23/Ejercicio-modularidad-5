/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo5.mod;

/**
 *
 * @author jepeh
 */
public class MostrarRegistro implements IMostrar{

    @Override
    public void mostrarRegistro(Estudiante e, double promediofinal, double promedioInical, boolean aprovado1, boolean aprovado2) {
        System.out.println("-----------Registro---------");
        System.out.println("Nombre: "+e.getNombre());
        System.out.println("Promedio Inicial: "+ promedioInical);
        System.out.println("Estado Inicial: "+ (aprovado1 ?"Aprovado": "Reprovado"));
        System.out.println("Promedio Final: "+promediofinal);
        System.out.println("Estado Final: "+(aprovado2 ?"Aprovado":"Reprovado"));
        System.out.println("----------Fin Registro---------0");

    }

    
}
