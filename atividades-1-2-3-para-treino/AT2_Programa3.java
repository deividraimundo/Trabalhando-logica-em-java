import javax.swing.JOptionPane;
public class AT2_Programa3 {
    public static void main(String[] args){
        Casa c = new Casa();
        
        
        c.p1.abre();
        c.p2.fecha();
        c.p3.abre();
        
        c.s = JOptionPane.showInputDialog("Digite a cor da caasa");
        JOptionPane.showMessageDialog(null, "Cor da casa: " + c.s);
        JOptionPane.showMessageDialog(null, "Quantidade de portas abertas: " + c.quantasPortasEstaoAbertas());
    }
}    
 

