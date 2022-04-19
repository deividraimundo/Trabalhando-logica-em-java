
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class Funcionario {

    String nome;
    String departamento;
    double salario;
    Data dataadm;
    String RG;
    boolean status;

    void bonifica(Data d) {
        if(d.ano>=1999 && d.ano<=2003){
            this.salario = this.salario * 1.02;
        }
        if(d.ano>=2004 && d.ano<=2014){
            this.salario = this.salario * 1.025;
        } 
        if(d.ano>=2015 && d.ano<=2021){
            this.salario = this.salario * 1.035;
        }  
    }

    void demitir() {
        this.status = false;
    }

    void mostra() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome
                + "\nDepartamento: " + this.departamento
                + "\nSalário: " + this.salario
                + "\nData de admissão: " + this.dataadm
                + "\nRG: " + this.RG
                + "\nStatus: " + this.status);
    }

    public double maiorSalario(Funcionario f1, Funcionario f2, Funcionario f3) {
        double maior;
        maior = 0;
        if (f1.salario > maior) {
            maior = f1.salario;
        }
        if (f2.salario > maior) {
            maior = f2.salario;
        }
        if (f3.salario > maior) {
            maior = f2.salario;
        }
        return maior;
    }

    public double menorSalario(Funcionario f1, Funcionario f2, Funcionario f3) {
        double menor;
        menor = f1.salario;
        if (f1.salario < menor) {
            menor = f1.salario;
        }
        if (f2.salario < menor) {
            menor = f2.salario;
        }
        if (f3.salario < menor) {
            menor = f3.salario;
        }
        return menor;
    }
    
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
    String bonificaf(int diadig, int mesdig, int anodig){
    int ano = localDate.getYear();
    System.out.println("Ano: " + ano);
    
    int mes = localDate.getMonthValue();
    System.out.println("Mês: " + mes);
    
    int dia = localDate.getDayOfMonth();
    System.out.println("Dia: " + dia);
    
     if (ano==anodig && dia==diadig && mes==mesdig){
        this.salario = this.salario * 1.13;
        return "Bônus aprovado";
    } else {
         return "Você não foi contemplado";
     }
    }
}
