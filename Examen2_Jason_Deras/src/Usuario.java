
import java.util.*;
import javax.swing.JOptionPane;

public class Usuario extends Persona {

    private String usuario;
    private String contrasenia;
    private ArrayList chats = new ArrayList();
    private ArrayList<Persona> amigos = new ArrayList();
    private int conexion;

    public Usuario() {
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario(String usuario, String contrasenia, int conexion) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.conexion = conexion;
    }

    public Usuario(String usuario, String contrasenia, int conexion, String nombre, String apellido, String numero_telefono) {
        super(nombre, apellido, numero_telefono);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.setConexion(conexion);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public ArrayList getChats() {
        return chats;
    }

    public void setChats(ArrayList chats) {
        this.chats = chats;
    }

    public ArrayList<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Persona> amigos) {
        this.amigos = amigos;
    }

    public int getConexion() {
        return conexion;
    }

    public void setConexion(int conexion) {
        if (conexion >= 1 && conexion <= 5) {
            this.conexion = conexion;
        } else {
            JOptionPane.showMessageDialog(null, "El valor de la conexion no es valido");
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "amigos=" + amigos + '}';
    }

  

}
