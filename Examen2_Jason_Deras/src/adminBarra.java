
import javax.swing.JProgressBar;

public class adminBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private Usuario mandar;
    private Usuario recibir;

    public adminBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public Usuario getMandar() {
        return mandar;
    }

    public void setMandar(Usuario mandar) {
        this.mandar = mandar;
    }

    public Usuario getRecibir() {
        return recibir;
    }

    public void setRecibir(Usuario recibir) {
        this.recibir = recibir;
    }
    

    public void run() {
        int s1 = (int) (0.6 * mandar.getConexion());
        int s2 = (int) (0.85 * recibir.getConexion());
        int total = s1 + s2;
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == total) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
            }
        }
    }
}
