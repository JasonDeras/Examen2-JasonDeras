
import java.io.Serializable;
import java.util.ArrayList;

public class Privado implements Serializable {

    private ArrayList<Mensajes> men = new ArrayList();
    private Usuario user;
    private static final long SerialVersionUID = 777L;

    public Privado() {
    }

    public Privado(Usuario user) {
        this.user = user;
    }

    public ArrayList<Mensajes> getMen() {
        return men;
    }

    public void setMen(ArrayList<Mensajes> men) {
        this.men = men;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Privado{" + "men=" + men + ", user=" + user + '}';
    }

}
