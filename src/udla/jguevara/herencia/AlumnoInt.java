package udla.jguevara.herencia;

public class AlumnoInt extends Alumno {
    private String ciudad;
    // Constructor de AlumnoInt
    public AlumnoInt(String nombre, String apellido, String carrera, String ciudad) {
        super(nombre, apellido, carrera); // Llamada al constructor de la clase padre (Alumno)
        this.ciudad = ciudad; // Inicialización de atributo propio
    }

}
