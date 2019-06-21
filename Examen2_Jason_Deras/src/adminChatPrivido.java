
import java.io.*;
import java.util.*;

public class adminChatPrivido {

    private ArrayList<Privado> listp = new ArrayList();
    private File archivo = null;

    public adminChatPrivido(String path) {
        archivo = new File(path);
    }

    public ArrayList<Privado> getListaPersonas() {
        return listp;
    }

    public void setListaPersonas(ArrayList<Privado> listp) {
        this.listp = listp;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Privado a) {
        listp.add(a);
    }

    public void cargarArchivo() {
        try {
            listp = new ArrayList();
            Privado temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Privado) objeto.readObject()) != null) {
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
            for (Privado t : listp) {
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
