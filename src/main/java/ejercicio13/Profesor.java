/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author raquel
 */
public class Profesor extends Persona {
    
    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellidos, String NIF, Direccion direccion) {
        super(nombre, apellidos, NIF, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    
}
