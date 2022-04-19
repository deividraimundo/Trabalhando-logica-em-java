
import javax.swing.JOptionPane;

public class AT2_Programa1 {
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        int niver;
        do{
        JOptionPane.showMessageDialog(null, "Nome: " + p.nome);
        JOptionPane.showMessageDialog(null, "Idade: " + p.idade);
        niver = Integer.parseInt(JOptionPane.showInputDialog("José está fazendo aniversário? 1-Sim/2-Não"));
        if (niver == 1){
        p.fazAniversario();
        }
        }while(niver==1);
    }
}
    

