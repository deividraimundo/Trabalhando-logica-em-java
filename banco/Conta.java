
package aula.pkg3.exercicio.pkg1;
class Conta {
    double saldo;
     boolean saca (double quantidade) {
        if (this.saldo < quantidade){
            System.out.println("Não");
            return false;
        }
        else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }     
    boolean deposita (double quantidade){
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
        return true;
    }
    
    void transfere (Conta c, double valor){
        this.saca(valor);
        c.deposita(valor);
        
    }
    }
    
    



