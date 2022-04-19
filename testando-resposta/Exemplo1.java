
import javax.swing.JOptionPane;


public class Exemplo1 {
    public static void main(String[] args){
        

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
        JOptionPane.showMessageDialog(null, a);
        
        TestaResposta av = new TestaResposta();
        JOptionPane.showMessageDialog(null, av.ver(a));
       
    }
}
