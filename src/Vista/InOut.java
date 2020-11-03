package Vista;

import javax.swing.JOptionPane;

public class InOut
{
    private String titulo,msj;

    public InOut(String titulo, String msj) {
        this.titulo = titulo;
        this.msj = msj;
    }

    public InOut(){
        this.titulo = "";
        this.msj = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public int pedirEntero(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,titulo,1));
    }

    public double pedirDecimal(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(null,mensaje,titulo,1)) ;
    }
    public String leerTexto(String mensaje) {
        return	JOptionPane.showInputDialog(null,mensaje,titulo,1);
    }

    public void mostrar(String msj) {
        JOptionPane.showMessageDialog(null,msj, titulo, 1);
    }
    public boolean confirmar(String msj) {
        int resp=JOptionPane.showConfirmDialog(
                null, msj, titulo, 0,JOptionPane.QUESTION_MESSAGE);
        if (resp==JOptionPane.YES_OPTION)
            return true;
        else
            return false;
    }
}