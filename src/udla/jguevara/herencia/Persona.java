package udla.jguevara.herencia;

public class Persona {
    // Declaración de atributos.
    private String nombre;
    private String apellido;
    // Creación del constructor que luego se invoca en Alumno
    public Persona(String nombre, String apellido) {
    }
    // Creación de getters y setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
