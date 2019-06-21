
import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String apellido;
    private String numero_telefono;
    private static final long SerialVersionUID = 777L;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numero_telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_telefono = numero_telefono;
    }

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

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
