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
public interface Identificable {

    public default void identificate() {
        if (this instanceof Profesor) {
            System.out.println("Profesor");
        } else if (this instanceof Estudiante) {
            System.out.println("Estudiante");
        }
    }

}
