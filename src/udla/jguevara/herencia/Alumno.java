package udla.jguevara.herencia;

public class Alumno extends Persona{
    // Declaración de atributos
    private String carrera;


    // Constructor
    // public Alumno(){} Ya no es necesario, no tiene utilidad.

    /* Al ser una clase padre se puede crear un constructor desde una clase hija.
       IMPORTANTE: Debe tener todos los atributos de la clase padre.
       Si necesito los atributos de la clase padre debemos crear un CONSTRUCTOR en la clase padre.
     */

    // Constructor de Alumno
    public Alumno(String nombre, String apellido, String carrera) {
        super(nombre, apellido); // Llamada al constructor de la clase base
        this.carrera = carrera; // Inicialización de atributo propio
    }





    // Creación de getters y setters.
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

// Generalizar: Clases que mantienen atributos comunes.
// Por polimorrfismo puedo modificar cualquier metodo mientras no tenga la palabra final.
