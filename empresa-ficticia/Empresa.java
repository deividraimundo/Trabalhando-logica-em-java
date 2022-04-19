
import javax.swing.JOptionPane;

public class Empresa {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        Data d = new Data();
        boolean giro = true;

        f1.nome = JOptionPane.showInputDialog("Digite o nome do funcionário 1: ");
        f1.RG = JOptionPane.showInputDialog("Digite o RG do funcionário 1: ");
        d.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admissão do funcionário 1: "));
        d.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de admissão do funcionário 1: "));
        d.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de admissão do funcionário 1: "));
        f1.dataadm = d;
        f1.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário 1: "));
        f1.departamento = JOptionPane.showInputDialog("Digite o departamento do funcionário 1: ");
        f1.bonifica(d);
        f1.status = true;

        Data d2 = new Data();
        while (giro) {
            String rg2 = JOptionPane.showInputDialog("Digite o RG do funcionário 2: ");

            if (rg2.equals(f1.RG)) {
                JOptionPane.showMessageDialog(null, "Digite o RG diferente; " + "Erro");
            } else {
                giro = false;
                f2.nome = JOptionPane.showInputDialog("Digite o nome do funcionário 2: ");
                f2.RG = rg2;
                d2.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admissão do funcionário 2: "));
                d2.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de admissão do funcionário 2: "));
                d2.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de admissão do funcionário 2: "));
                f2.dataadm = d2;
                f2.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário 2: "));
                f2.departamento = JOptionPane.showInputDialog("Digite o departamento do funcionário 2: ");
                f2.bonifica(d2);
                f2.status = true;
            }
        }
        Data d3 = new Data();
        boolean girar = true;
        while (girar) {
            String rg3 = JOptionPane.showInputDialog("Digite o RG do funcionário 3: ");

            if (rg3.equals(f1.RG) || rg3.equals(f2.RG)) {
                JOptionPane.showMessageDialog(null, "Digite o RG diferente; " + "Erro");
            } else {
                girar = false;
                f3.nome = JOptionPane.showInputDialog("Digite o nome do funcionário 3: ");
                f3.RG = rg3;
                d3.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admissão do funcionário 3: "));
                d3.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de admissão do funcionário 3: "));
                d3.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de admissão do funcionário 3: "));
                f3.dataadm = d3;
                f3.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário 3: "));
                f3.departamento = JOptionPane.showInputDialog("Digite o departamento do funcionário 3: ");
                f3.bonifica(d3);
                f3.status = true;
            }
        }
        //Mostrando o maior e o menor salário
        JOptionPane.showMessageDialog(null, "Maior salário: " + f1.maiorSalario(f1, f2, f3));
        JOptionPane.showMessageDialog(null, "Menor salário: " + f1.menorSalario(f1, f2, f3));
        JOptionPane.showMessageDialog(null, "Status de bonificação do funcionario1: " + f1.bonificaf(d.dia, d.mes, d.ano));
        JOptionPane.showMessageDialog(null, "Status de bonificação do funcionario2: " + f2.bonificaf(d2.dia, d2.mes, d2.ano));
        JOptionPane.showMessageDialog(null, "Status de bonificação do funcionario3: " + f3.bonificaf(d3.dia, d3.mes, d3.ano));
        JOptionPane.showMessageDialog(null, "Salário após bonificação do funcionario1: " + f1.salario);
        JOptionPane.showMessageDialog(null, "Salário após bonificação do funcionario2: " + f2.salario);
        JOptionPane.showMessageDialog(null, "Salário após bonificação do funcionario3: " + f3.salario);
    }
}
