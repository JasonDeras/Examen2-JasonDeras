
import java.io.*;
import java.util.*;

public class adminGrupo {

    private ArrayList<Grupo> listp = new ArrayList();
    private File archivo = null;

    public adminGrupo() {
    }

    public adminGrupo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Grupo> getListaPersonas() {
        return listp;
    }

    public void setListaPersonas(ArrayList<Grupo> listp) {
        this.listp = listp;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Grupo a) {
        listp.add(a);
    }

    public void cargarArchivo() {
        try {
            listp = new ArrayList();
            Grupo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Grupo) objeto.readObject()) != null) {
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
            for (Grupo t : listp) {
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
