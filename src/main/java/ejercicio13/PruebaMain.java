/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author raquel
 */
public class PruebaMain {
    
    
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        personas.add(new Profesor("Matematicas", "Juan", "Ruiz", "78945652", new Direccion("Calle Lagasca", "Marbella", "27600", "España")));
        personas.add(new Profesor("Historia", "Alba", "Vega", "784552101", new Direccion("Calle Antonio Machado", "Marbella", "27600", "España")));
        personas.add(new Profesor("Biologia", "Sara", "Alvarez", "45875652", new Direccion("Calle Garcia Lorca", "Estepona", "29688", "España")));
        personas.add(new Estudiante("12364", "Alvaro", "Garcia", "78956411", new Direccion("Calle Bellavista", "Sevilla", "41014", "España")));
        personas.add(new Estudiante("12364", "Lucia", "Gomez", "75968411", new Direccion("Av Plutarco", "Málaga", "29010", "España")));
        
        
    }
    
}
