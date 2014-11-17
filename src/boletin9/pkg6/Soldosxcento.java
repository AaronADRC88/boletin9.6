package boletin9.pkg6;

import javax.swing.JOptionPane;

public class Soldosxcento {

    private float soldo;
    private float percent;

    public float pedirSoldo() {
        float s;
        String dato = JOptionPane.showInputDialog(null, "Soldo=");
        s = Float.parseFloat(dato);
        if (s < 0) {
            JOptionPane.showMessageDialog(null, "dato no válido");
        }
        return s;
    }

    public void makeStatistical() {
        soldo=this.pedirSoldo();
        int contador = 0;
        while (soldo!=0){
            if (soldo >= 1000 || soldo<= 1750) {
                contador++;
            }
            int contador2 = 0;
            if (soldo< 1000) {
                contador2++;
                percent = (contador2 * 100) / (contador + contador2);
            }
        } 
        JOptionPane.showMessageDialog(null, "Soldos comprendidos entre[1000 e 1750]=" + contador + "\n" + "Porcentaxe de soldos menores de 1000€=" + percent + "%");
    }
}
