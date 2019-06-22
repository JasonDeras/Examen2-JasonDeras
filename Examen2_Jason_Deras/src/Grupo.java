
import java.io.Serializable;
import java.util.ArrayList;

public class Grupo extends Chat implements Serializable {

    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Usuario admin;
    private ArrayList<Mensajes> men = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Grupo() {
    }

    public Grupo(String nombre, Usuario admin) {
        this.nombre = nombre;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public ArrayList<Mensajes> getMen() {
        return men;
    }

    public void setMen(ArrayList<Mensajes> men) {
        this.men = men;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", admin=" + admin + '}';
    }

}
