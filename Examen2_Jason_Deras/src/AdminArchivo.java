
import java.io.*;
import java.util.*;

public class AdminArchivo {

    private ArrayList<Usuario> listp = new ArrayList();
    private File archivo = null;

    public AdminArchivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaPersonas() {
        return listp;
    }

    public void setListaPersonas(ArrayList<Usuario> listaAlumnos) {
        this.listp = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Usuario a) {
        listp.add(a);
    }

    public void cargarArchivo() {
        try {
            listp = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listp.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : listp) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
