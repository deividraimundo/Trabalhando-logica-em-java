
import javax.swing.JOptionPane;


public class AT2_Programa2 {
    public static void main(String[] args){
        Porta p = new Porta();
        p.abre();
        JOptionPane.showMessageDialog(null, "A porta está aberta? " + p.estaAberta());
        p.fecha();
        JOptionPane.showMessageDialog(null, "A porta está aberta? " +p.estaAberta());
        p.dimensaoX = Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensão X: "));
        p.dimensaoY = Double.parseDouble(JOptionPane.showInputDialog("Digite a dimnesão Y: "));
        p.dimensaoZ = Double.parseDouble(JOptionPane.showInputDialog("Digite a dimensão Z: "));
        JOptionPane.showMessageDialog(null, "Dimensão X: " + p.dimensaoX);
        JOptionPane.showMessageDialog(null, "Dimensão Y: " + p.dimensaoY);
        JOptionPane.showMessageDialog(null, "Dimensão Z: " + p.dimensaoZ);
        p.s = JOptionPane.showInputDialog("Digite a cor da porta");
        JOptionPane.showMessageDialog(null, "Cor da porta: " + p.s);
    }
}
