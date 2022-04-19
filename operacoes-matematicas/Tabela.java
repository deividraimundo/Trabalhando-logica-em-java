
import javax.swing.JOptionPane;


public class Tabela {
    public static void main(String[] args){
        
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
                + "1 - Somar\n"
                + "2 - Subtrair\n"
                + "3 - Multiplicar\n"
                + "4 - dividir\n"
                + "5 - Resto da divisão\n"
                + "6 - Sair"));
        
        Operacoes op = new Operacoes();
        
        switch(opt){
            case 1: {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                JOptionPane.showMessageDialog(null, "Resultado:" + op.soma(n1,n2));
            }
            break;
            case 2: {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                JOptionPane.showMessageDialog(null, "Resultado:" + op.subtracao(n1,n2));
            }
            break;
            case 3: {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                JOptionPane.showMessageDialog(null, "Resultado:" + op.multiplicar(n1,n2));
            }
            break;
            case 4: {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                JOptionPane.showMessageDialog(null, "Resultado:" + op.dividir(n1,n2));
            }
            break;
            case 5: {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                JOptionPane.showMessageDialog(null, "Resultado:" + op.resto(n1,n2));
            }
            break;
            case 6: {
                System.exit(0);
            }
        }
    }    
}
